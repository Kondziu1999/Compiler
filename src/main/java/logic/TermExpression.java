package logic;

import org.antlr.v4.runtime.tree.ParseTree;

enum TermOperations {
    MULTIPLY,
    DIVIDE
}


public class TermExpression {
    public Double firstValue;
    public Double secondValue;
    public TermOperations operation;

    public TermExpression(ParseTree firstValueContext, ParseTree secondValueContext, ParseTree operationContext) {

        this.firstValue = firstValueContext.getChildCount() >= 3 ? !isArithm(firstValueContext) ? new TermExpression(firstValueContext.getChild(0), firstValueContext.getChild(2), firstValueContext.getChild(1)).evaluate() : new ArithmExpression(firstValueContext.getChild(0), firstValueContext.getChild(2), firstValueContext.getChild(1)).evaluate() : new TermExpression(firstValueContext.getChild(0)).evaluate();
        this.secondValue = secondValueContext.getChildCount() >= 3 ? !isArithm(secondValueContext) ? new TermExpression(secondValueContext.getChild(0), secondValueContext.getChild(2), secondValueContext.getChild(1)).evaluate() : new ArithmExpression(secondValueContext.getChild(0), secondValueContext.getChild(2), secondValueContext.getChild(1)).evaluate() : new TermExpression(secondValueContext.getChild(0)).evaluate();
        this.operation = operationContext.getText().equals("*") ? TermOperations.MULTIPLY : TermOperations.DIVIDE;
    }
    
    public TermExpression(ParseTree singleValueContext) {
        if(singleValueContext == null){
            this.firstValue = 0.0;
            return;
        }
        this.firstValue = singleValueContext.getChildCount() >= 3 ? !isArithm(singleValueContext) ? new TermExpression(singleValueContext.getChild(0), singleValueContext.getChild(2), singleValueContext.getChild(1)).evaluate() : new ArithmExpression(singleValueContext.getChild(0), singleValueContext.getChild(2), singleValueContext.getChild(1)).evaluate() : getValueForText(singleValueContext.getText());
    }

    private Double getValueForText(String text) {
        try {
            return Double.parseDouble(text);
        } catch (Exception e) {
            // This means that text is a variable
            return NumbersVariableContainer.getValue(text);
            
            return Double.parseDouble("XDD");
        }
    }

    public Double evaluate() {
        if (secondValue == null) {
            return firstValue;
        }

        return operation == TermOperations.MULTIPLY ? firstValue * secondValue : firstValue / secondValue;
    }

    private boolean isArithm(ParseTree child) {
        return (child.getText().contains("+") || child.getText().contains("-"));
    }
}