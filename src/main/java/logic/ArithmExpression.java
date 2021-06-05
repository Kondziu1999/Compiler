package logic;

public enum ArithmOperations {
    PLUS,
    MINUS
}

public class ArithmExpression {
    public Double firstValue;
    public Double secondValue;
    public ArithmOperations operation;

    public ArithmExpression(ParseTree firstValueContext, ParseTree secondValueContext, ParseTree operationContext) {
        this.firstValue = firstValueContext.getChildCount() >= 3 ? isTerm(firstValueContext) ? new TermExpression(firstValueContext.getChild(0), firstValueContext.getChild(2), firstValueContext.getChild(1)).evaluate() : new ArithmExpression(firstValueContext.getChild(0), firstValueContext.getChild(2), firstValueContext.getChild(1)).evaluate() : new ArithmExpression(firstValueContext.getChild(0)).evaluate();
        this.secondValue = secondValueContext.getChildCount() >= 3 ? isTerm(secondValueContext) ? new TermExpression(secondValueContext.getChild(0), secondValueContext.getChild(2), secondValueContext.getChild(1)).evaluate() : new ArithmExpression(secondValueContext.getChild(0), secondValueContext.getChild(2), secondValueContext.getChild(1)).evaluate() : new ArithmExpression(secondValueContext.getChild(0)).evaluate();
        this.operation = operationContext.getText().equals("+") ? ArithmOperations.PLUS : ArithmOperations.MINUS;
    }
    
    public ArithmExpression(ParseTree singleValueContext) {
        this.firstValue = Double.parseDouble(singleValueContext.getText());
    }

    public Double evaluate() {
        if (secondValue == null) {
            return firstValue;
        }

        return operation == ArithmOperations.PLUS ? firstValue + secondValue : firstValue - secondValue;
    }

    private boolean isTerm(ParseTree child) {
        return (child.getText().contains("*") || child.getText().contains("/"));
    }
}