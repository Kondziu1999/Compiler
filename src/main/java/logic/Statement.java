package logic;

import org.antlr.v4.runtime.tree.ParseTree;
import parser.EZPython4Lexer;
import parser.EZPython4Parser;

enum StatementType {
    VARIABLEASSIGNMENT,
    WHILE,
    IF,
    FUNCTIONDECLARATION,
    FUNCTIONCALL,
    PRINT
}

public class Statement {
    public ParseTree statementContext;
    public StatementType type;

    public Statement(ParseTree statementContext) {
        this.statementContext = statementContext.getChild(0);

        var statementAsText = this.statementContext.getText();

        if (statementAsText.startsWith("while")) {
            this.type = StatementType.WHILE;
        }
        else if (statementAsText.startsWith("if")) {
            this.type = StatementType.IF;
        }
        else if (statementAsText.contains("=")) {
            this.type = StatementType.VARIABLEASSIGNMENT;
        }
        else if (statementAsText.startsWith("function")) {
            this.type = StatementType.FUNCTIONDECLARATION;
        }
        else if (statementAsText.contains("()")) {
            this.type = StatementType.FUNCTIONCALL;
        }
        else if (statementAsText.contains("print")){
            this.type = StatementType.PRINT;
        }
    }

    public void evaluate() {
        switch (this.type) {
            case IF: {
                var ifExpr = new WhileOrIf(this.statementContext.getChild(2), true, this.statementContext.getChild(this.statementContext.getChildCount() - 2));
                ifExpr.perform();
            }
            break;
            case WHILE: {
                var whileExpr = new WhileOrIf(this.statementContext.getChild(2), false, this.statementContext.getChild(this.statementContext.getChildCount() - 2));
                whileExpr.perform();
            }
            break;
            case VARIABLEASSIGNMENT: {
                var name = this.statementContext.getChild(1).getText();
                var type = this.statementContext.getChild(0);
                var value = this.statementContext.getChild(3);
                if(BoolsVariableContainer.getValue(name) != null || NumbersVariableContainer.getValue(name) != null || StringsVariableContainer.getValue(name) != null){
                    throw new RuntimeException("Variable "+ name + " is already assigned");
                }
                switch (type.getText()) {
                    case "bool":
                    {
                        var logicExpr = new LogicExpression(value);
                        var boolVariable = new BoolVariable(name, logicExpr.evaluate());

                        BoolsVariableContainer.setVariable(boolVariable);
                    }
                    break;
                    case "int":
                    {
                        var arithmExpr = new ArithmExpression(value);
                        var numberVariable = new NumberVariable(name, arithmExpr.evaluate());

                        NumbersVariableContainer.setVariable(numberVariable);
                    }
                    break;
                    case "string":
                    {
                        var stringVariable = new StringVariable(name, value.getText() );

                        StringsVariableContainer.setVariable(stringVariable);
                    }
                    break;
                    default:
                    {
                        var valueReAssing = this.statementContext.getChild(2);
                        name = this.statementContext.getChild(0).getText();

                        if(BoolsVariableContainer.getValue(name) != null){
                            var logicExpr = new LogicExpression(valueReAssing);
                            var boolVariable = new BoolVariable(name, logicExpr.evaluate());
                            BoolsVariableContainer.setVariable(boolVariable);
                        }
                        else if(NumbersVariableContainer.getValue(name) != null){
                            if(valueReAssing.getChild(0).getChildCount() >=3){
                                valueReAssing = valueReAssing.getChild(0);
                            }
                            var arithmExpr = new ArithmExpression(valueReAssing);
                            var numberVariable = new NumberVariable(name, arithmExpr.evaluate());

                            if(Math.floor(NumbersVariableContainer.getValue(name)) - NumbersVariableContainer.getValue(name) == 0){ // check if it's an int
                                numberVariable = new NumberVariable(name, Math.floor(arithmExpr.evaluate()));
                            }

                            NumbersVariableContainer.setVariable(numberVariable);
                        }
                        else if(StringsVariableContainer.getValue(name) != null){
                            var stringVariable = new StringVariable(name, valueReAssing.getText());
                            StringsVariableContainer.setVariable(stringVariable);
                        }

                    }

                }
            }
            break;
            case FUNCTIONDECLARATION: {
                var funcExpr = new Function(this.statementContext.getChild(1).getText(), this.statementContext.getChild(this.statementContext.getChildCount() - 2));
                FunctionsContainer.addFunction(funcExpr);
            }
            break;
            case FUNCTIONCALL: {
                var functionCall = FunctionsContainer.getFunctionByName(this.statementContext.getChild(0).getText());
                functionCall.perform();
            }
            break;
            case PRINT:{
                var printText = new Print((EZPython4Parser.PrintFuncContext)statementContext);
                printText.evaluate();
            }
        }
    }
}