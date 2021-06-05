package logic;

import org.antlr.v4.runtime.tree.ParseTree;

enum ArithmOperations {
    PLUS,
    MINUS
}

public class ArithmExpression {
    public Double firstValue;
    public Double secondValue;
    public ArithmOperations operation;

    public ArithmExpression(ParseTree firstValueContext, ParseTree secondValueContext, ParseTree operationContext) {
        if(firstValueContext.getText().equals("(")){
            this.firstValue = operationContext.getChildCount() >= 3 ? isTerm(operationContext) ? new TermExpression(operationContext.getChild(0), operationContext.getChild(2), operationContext.getChild(1)).evaluate() : new ArithmExpression(operationContext.getChild(0), operationContext.getChild(2), operationContext.getChild(1)).evaluate() : new ArithmExpression(operationContext.getChild(0)).evaluate();
            this.secondValue = 0.0;
            this.operation = ArithmOperations.PLUS;
        }
        else if(isTerm(operationContext)){
            this.firstValue =  new TermExpression(firstValueContext, secondValueContext,operationContext).evaluate();
            this.secondValue = 0.0;
            this.operation = ArithmOperations.PLUS;
        }
        else {

            this.firstValue = firstValueContext.getChildCount() >= 3 ? isTerm(firstValueContext) ? new TermExpression(firstValueContext.getChild(0), firstValueContext.getChild(2), firstValueContext.getChild(1)).evaluate() : new ArithmExpression(firstValueContext.getChild(0), firstValueContext.getChild(2), firstValueContext.getChild(1)).evaluate() : new ArithmExpression(firstValueContext.getChild(0)).evaluate();
            this.secondValue = secondValueContext.getChildCount() >= 3 ? isTerm(secondValueContext) ? new TermExpression(secondValueContext.getChild(0), secondValueContext.getChild(2), secondValueContext.getChild(1)).evaluate() : new ArithmExpression(secondValueContext.getChild(0), secondValueContext.getChild(2), secondValueContext.getChild(1)).evaluate() : new ArithmExpression(secondValueContext.getChild(0)).evaluate();
            this.operation = operationContext.getText().equals("+") ? ArithmOperations.PLUS : ArithmOperations.MINUS;

        }
    }
    
    public ArithmExpression(ParseTree singleValueContext) {
        if(singleValueContext == null){
            this.firstValue = 0.0;
            return;
        }
        this.firstValue = singleValueContext.getChildCount() >= 3 ? isTerm(singleValueContext) ? new TermExpression(singleValueContext.getChild(0), singleValueContext.getChild(2), singleValueContext.getChild(1)).evaluate() : new ArithmExpression(singleValueContext.getChild(0), singleValueContext.getChild(2), singleValueContext.getChild(1)).evaluate() : getValueForText(singleValueContext.getText());
    }

    private Double getValueForText(String text) {
        try {
            return Double.parseDouble(text);
        } catch (Exception e) {
            // This means that text is a variable
            return NumbersVariableContainer.getValue(text);

        }
    }

    public Double evaluate() {
        if (secondValue == null) {
            return firstValue;
        }

        return operation == ArithmOperations.PLUS ? firstValue + secondValue : firstValue - secondValue;
    }

    private boolean isTerm(ParseTree child) {
        return (child.getText().contains("*") || child.getText().contains("/")) ;
    }
}