package logic;

// bool result = (innaZmienna and true) or false and not(5 > 2) and 1 ≠ 0;
import org.antlr.v4.runtime.tree.ParseTree;

enum LogicOperations {
    AND,
    OR
}

public class LogicExpression {
    public Boolean firstValue;
    public Boolean secondValue;
    public LogicOperations operation;

    public LogicExpression(ParseTree firstValueContext, ParseTree secondValueContext, ParseTree operationContext) {
        this.firstValue = firstValueContext.getChildCount() >= 3 ? isTerm(firstValueContext) ? new LogicTermExpression(firstValueContext.getChild(0), firstValueContext.getChild(2), firstValueContext.getChild(1)).evaluate() : new LogicExpression(firstValueContext.getChild(0), firstValueContext.getChild(2), firstValueContext.getChild(1)).evaluate() : new LogicExpression(firstValueContext.getChild(0)).evaluate();
        this.secondValue = secondValueContext.getChildCount() >= 3 ? isTerm(secondValueContext) ? new LogicTermExpression(secondValueContext.getChild(0), secondValueContext.getChild(2), secondValueContext.getChild(1)).evaluate() : new LogicExpression(secondValueContext.getChild(0), secondValueContext.getChild(2), secondValueContext.getChild(1)).evaluate() : new LogicExpression(secondValueContext.getChild(0)).evaluate();
        this.operation = operationContext.getText().equals("and") ? LogicOperations.AND : LogicOperations.OR;
    }
    
    public LogicExpression(ParseTree singleValueContext) {
        if (singleValueContext == null){
            this.firstValue = true;
            return;
        }
        this.firstValue = singleValueContext.getChildCount() >= 3 ? isTerm(singleValueContext) ? new LogicTermExpression(singleValueContext.getChild(0), singleValueContext.getChild(2), singleValueContext.getChild(1)).evaluate() : new LogicExpression(singleValueContext.getChild(0), singleValueContext.getChild(2), singleValueContext.getChild(1)).evaluate() : getValueForText(singleValueContext.getText());
    }

    private Boolean getValueForText(String text) {
        try {
            return Boolean.parseBoolean(text);
        } catch (Exception e) {
            // This means that text is a variable
            return BoolsVariableContainer.getValue(text);

        }
    }

    public Boolean evaluate() {
        if (secondValue == null) {
            return firstValue;
        }

        return operation == LogicOperations.AND ? firstValue && secondValue : firstValue || secondValue;
    }

    private boolean isTerm(ParseTree child) {
        return child.getText().contains(">") 
        || child.getText().contains("<") 
        || child.getText().contains("<=")
        || child.getText().contains(">=")
        || child.getText().contains("==")
        || child.getText().contains("≠");
    }
}