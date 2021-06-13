package parser;

import logic.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.Stack;


public class EZPython4ListenerImpl extends EZPython4BaseListener {


    private Stack<Double> arithmValues = new Stack<Double>();
    private Stack<Boolean> logicValues = new Stack<Boolean>();
    private Stack<String> stringValues = new Stack<String>();


    @Override
    public void enterIfStmt(EZPython4Parser.IfStmtContext ctx) {
        var ifExpr = new WhileOrIf(ctx.logicExpr(), true, ctx.codeSection());
        ifExpr.perform();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ctx.removeLastChild();
        }

    }

    @Override
    public void enterWhileStmt(EZPython4Parser.WhileStmtContext ctx) {
        var whileExpr = new WhileOrIf(ctx.logicExpr(), false, ctx.codeSection());
        whileExpr.perform();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ctx.removeLastChild();
        }
    }


    @Override
    public void enterFuncStmt(EZPython4Parser.FuncStmtContext ctx) {
        var funcExpr = new Function(ctx.VARIABLE_T().getText(), ctx.codeSection());
        FunctionsContainer.addFunction(funcExpr);

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ctx.removeLastChild();
        }
    }

    @Override
    public void exitFuncCall(EZPython4Parser.FuncCallContext ctx) {

        var functionCall = FunctionsContainer.getFunctionByName(ctx.VARIABLE_T().getText());
        functionCall.perform();
    }

    @Override
    public void exitVariableStmt(EZPython4Parser.VariableStmtContext ctx) {


        var name = ctx.VARIABLE_T().getText();
        var type = ctx.type() == null ? ctx.BOOL_TYPE_T() == null ? ctx.STRING_TYPE_T() : ctx.BOOL_TYPE_T() : ctx.type();
        var value = ctx.value();
        if (value != null) {
            arithmValues.push(Double.parseDouble(value.getText()));
        }
        if (BoolsVariableContainer.getValue(name) != null || NumbersVariableContainer.getValue(name) != null || StringsVariableContainer.getValue(name) != null) {
            throw new RuntimeException("Variable " + name + " is already assigned");
        }


        switch (type.getText()) {
            case "bool": {
                var boolVariable = new BoolVariable(name, logicValues.pop());
                BoolsVariableContainer.setVariable(boolVariable);
            }
            break;
            case "int": {
                var numberVariable = new NumberVariable(name, (Math.floor(arithmValues.pop())));
                NumbersVariableContainer.setVariable(numberVariable);
            }
            break;
            case "double": {
                var numberVariable = new NumberVariable(name, arithmValues.pop());
                NumbersVariableContainer.setVariable(numberVariable);
            }
            break;
            case "string": {
                var stringText = ctx.STRING_T().getText().replaceAll("\"","");

                var stringVariable = new StringVariable(name, stringText);
                StringsVariableContainer.setVariable(stringVariable);
            }
            break;
        }

    }

    @Override
    public void exitVariableReAssignStmt(EZPython4Parser.VariableReAssignStmtContext ctx) {
        var name = ctx.VARIABLE_T().getText();
        var value = ctx.value();
        if (value != null) {
            arithmValues.push(Double.parseDouble(value.getText()));
        }

        if (NumbersVariableContainer.getValue(name) != null) {
            var numberVariable = new NumberVariable(name, arithmValues.pop());
            NumbersVariableContainer.setVariable(numberVariable);
        } else if (BoolsVariableContainer.getValue(name) != null) {
            var boolVariable = new BoolVariable(name, logicValues.pop());
            BoolsVariableContainer.setVariable(boolVariable);
        } else if (StringsVariableContainer.getValue(name) != null) {
            var stringVariable = new StringVariable(name, ctx.STRING_T().getText());
            StringsVariableContainer.setVariable(stringVariable);
        }

    }


    @Override
    public void exitArithmExpr(EZPython4Parser.ArithmExprContext ctx) {
        var childCount = ctx.getChildCount();
//        for(int x= 0; x< ctx.getChildCount();x++){
//
//            System.out.println(x + "---" + ctx.getChild(x).getText());
//        }

//        if (childCount == 1 && !(isArithm(ctx.getChild(0)))) {
//            if (hasParentThatCouldBeEvaluated(ctx.getParent())) {
//                return; // Bo parent sobie stacka da
//            }
//            arithmValues.push(Double.parseDouble(ctx.getChild(0).getText()));
//        }

        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var arithmExpression = new ArithmExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));
            arithmValues.push(arithmExpression.evaluate());
        }
    }

    private boolean hasParentThatCouldBeEvaluated(ParserRuleContext ctx) {
        return ctx.getRuleContext() instanceof EZPython4Parser.ArithmExprContext || ctx.getRuleContext() instanceof EZPython4Parser.TermContext;
    }

    private boolean hasParentThatCouldBeEvaluated2(ParserRuleContext ctx) {
        return ctx.getRuleContext() instanceof EZPython4Parser.LogicExprContext;
    }

    private boolean isTerm(ParseTree child) {
        return (child.getText().contains("*") || child.getText().contains("/"));
    }

    private boolean isArithm(ParseTree child) {
        return (child.getText().contains("+") || child.getText().contains("-"));
    }

    private boolean isLogic(ParseTree child) {
        return (child.getText().contains("or") || child.getText().contains("and"));
    }

    @Override
    public void exitTerm(EZPython4Parser.TermContext ctx) {
        var childCount = ctx.getChildCount();
//        for(int x= 0; x< ctx.getChildCount();x++){
//            System.out.println(x + "+++" + ctx.getChild(x).getText());
//        }

//        if (childCount == 1 && !(isTerm(ctx.getChild(0)))) {
//            if (hasParentThatCouldBeEvaluated(ctx.getParent())) {
//                return; // Bo parent sobie stacka da
//            }
//            arithmValues.push(Double.parseDouble(ctx.getChild(0).getText()));
//        }


        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var termExpression = new TermExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));
//            System.out.println("stackterm" + termExpression.evaluate().toString());
            arithmValues.push(termExpression.evaluate());
        }
    }


    @Override
    public void exitLogicExpr(EZPython4Parser.LogicExprContext ctx) {
    }


    @Override
    public void exitLogicalOR(EZPython4Parser.LogicalORContext ctx) {
        var childCount = ctx.getChildCount();
        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var logicExpression = new LogicExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));

            logicValues.push(logicExpression.evaluate());
        }
    }

    @Override
    public void exitLogicalAND(EZPython4Parser.LogicalANDContext ctx) {
        var childCount = ctx.getChildCount();
        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var logicExpression = new LogicExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));

            logicValues.push(logicExpression.evaluate());
        }
    }

    @Override
    public void exitLogicalTerm(EZPython4Parser.LogicalTermContext ctx) {
        var childCount = ctx.getChildCount();


        if (childCount == 1 && !(ctx.getChild(0).getText().contains("and") || ctx.getChild(0).getText().contains("or"))) {
            if (hasParentThatCouldBeEvaluated2(ctx.getParent())) {
                return; // Bo parent sobie stacka da
            }
            logicValues.push(Boolean.parseBoolean(ctx.getChild(0).getText()));
        }

        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var logicTermExpression = new LogicTermExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));

            logicValues.push(logicTermExpression.evaluate());
        }

    }

    @Override
    public void exitLogicalVal(EZPython4Parser.LogicalValContext ctx) {
        logicValues.push(Boolean.parseBoolean(ctx.getChild(0).getText()));
    }


    @Override
    public void exitPrintFunc(EZPython4Parser.PrintFuncContext ctx) {
        var printText = new Print(ctx);
        printText.evaluate();
    }


}