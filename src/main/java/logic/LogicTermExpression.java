package logic;

// bool result = (innaZmienna and true) or false and not(5 > 2) and 1 ≠ 0;
import org.antlr.v4.runtime.tree.ParseTree;

enum LogicTermOperations {
    GREATER,
    GREATEREQ,
    LESS,
    LESSEQ,
    EQUAL,
    NOTEQUAL
}

public class LogicTermExpression {
    public Double firstValue;
    public Double secondValue;
    public LogicTermOperations operation;

    public Boolean isPredefined = false;
    public Boolean predefinedValueForEvaluation;

    public LogicTermExpression(ParseTree firstValueContext, ParseTree secondValueContext, ParseTree operationContext) {
        if (firstValueContext.getChildCount() >= 3 || isLogic(firstValueContext)) {
            this.isPredefined = true;
            this.predefinedValueForEvaluation = new LogicExpression(firstValueContext.getChild(0), firstValueContext.getChild(2), firstValueContext.getChild(1)).evaluate();
        }

        if (secondValueContext.getChildCount() >= 3 || isLogic(secondValueContext)) {
            this.isPredefined = true;
            this.predefinedValueForEvaluation = new LogicExpression(secondValueContext.getChild(0), secondValueContext.getChild(2), secondValueContext.getChild(1)).evaluate();
        }

        this.firstValue = getValueForText(firstValueContext.getText());
        this.secondValue = getValueForText(secondValueContext.getText());
        
        switch (operationContext.getText()) {
            case ">": {
                this.operation = LogicTermOperations.GREATER;
            }
            break;
            case ">=": {
                this.operation = LogicTermOperations.GREATEREQ;
            }
            break;
            case "<": {
                this.operation = LogicTermOperations.LESS;
            }
            break;
            case "<=": {
                this.operation = LogicTermOperations.LESSEQ;
            }
            break;
            case "==": {
                this.operation = LogicTermOperations.EQUAL;

            }
            break;
            case "≠": {
                this.operation = LogicTermOperations.NOTEQUAL;
            }
            break;
        }
    }

    private Double getValueForText(String text) {
        try {
            return Double.parseDouble(text);
        } catch (Exception e) {
            // This means that text is a variable
            return NumbersVariableContainer.getValue(text);

        }
    }

    public Boolean evaluate() {
        if (isPredefined) {
            return predefinedValueForEvaluation;
        }
 
        switch (operation) {
            case GREATER: {
                return firstValue > secondValue;
            }
            case GREATEREQ: {
                return firstValue >= secondValue;
            }
            case LESS: {
                return firstValue < secondValue;
            }
            case LESSEQ: {
                return firstValue <= secondValue;
            }
            case EQUAL: {
//                System.out.println("evaluate eq = " + firstValue.equals(secondValue));
                return firstValue.equals(secondValue);

            }
            case NOTEQUAL: {
                return !firstValue.equals(secondValue);
            }
        }

        return true;
    }

    private boolean isLogic(ParseTree child) {
        return (child.getText().contains("and") || child.getText().contains("or"));
    }
}