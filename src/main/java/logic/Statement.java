package logic;

import org.antlr.v4.runtime.tree.ParseTree;

enum StatementType {
    VARIABLEASSIGNMENT,
    WHILE,
    IF,
    FUNCTIONDECLARATION,
    FUNCTIONCALL
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

                switch (type.getText()) {
                    case "bool":
                    {
                        var logicExpr = new LogicExpression(value);
                        var boolVariable = new BoolVariable(name, logicExpr.evaluate());

                        BoolsVariableContainer.setVariable(boolVariable);
                        System.out.println(boolVariable.value.toString());
                    }
                    break;
                    case "int":
                    {
                        var arithmExpr = new ArithmExpression(value);
                        var numberVariable = new NumberVariable(name, arithmExpr.evaluate());
                        System.out.println("XD;" + arithmExpr.evaluate());

                        NumbersVariableContainer.setVariable(numberVariable);
                        System.out.println(numberVariable.value.toString());
                    }
                    break;
                    case "string":
                    {
                        var stringVariable = new StringVariable(name, value.getText() );

                        StringsVariableContainer.setVariable(stringVariable);
                        System.out.println(stringVariable.value.toString());
                    }
                    break;
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
        }
    }
}