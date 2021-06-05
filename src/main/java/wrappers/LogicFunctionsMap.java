package wrappers;

import data.ComplexDouble;
import data.Logic;
import data.LogicOperationType;

import java.util.HashMap;

public class LogicFunctionsMap implements FunctionNamesMap {
    private HashMap<String, LogicOperationType> funcNames;

    public LogicFunctionsMap() {
        funcNames = new HashMap<String, LogicOperationType>();
        funcNames.put("&", LogicOperationType.AND);
        funcNames.put("and", LogicOperationType.AND);
        funcNames.put("or", LogicOperationType.OR);
        funcNames.put("|", LogicOperationType.OR);
        funcNames.put("==", LogicOperationType.Equal);
        funcNames.put("!=", LogicOperationType.NotEqual);
        funcNames.put("!", LogicOperationType.NOT);
        funcNames.put(">", LogicOperationType.Greater);
        funcNames.put(">=", LogicOperationType.GreaterEqual);
        funcNames.put("<", LogicOperationType.Lower);
        funcNames.put("<=", LogicOperationType.LowerEqual);
    }
    public LogicOperationType getType(String s){
        return funcNames.get(s);
    }
    @Override
    public boolean contains(String name) {
        return funcNames.containsKey(name);
    }

    @Override
    public ComplexDouble mapAndEvaluate(String funcName, ComplexDouble a) {
        var operationType = funcNames.get(funcName);
        if (operationType == LogicOperationType.NOT) {
            return boolToComplexDouble(Logic.not(a));
        }
        return ComplexDouble.i();
    }

    @Override
    public ComplexDouble mapAndEvaluate(String funcName, ComplexDouble a, ComplexDouble b) {
        var operationType = funcNames.get(funcName);
        switch (operationType){
            case Equal:
                return boolToComplexDouble(Logic.equal(a, b));
            case GreaterEqual:
                return boolToComplexDouble(Logic.greaterEqual(a, b));
            case LowerEqual:
                return boolToComplexDouble(Logic.lowerEqual(a, b));
            case Lower:
                return boolToComplexDouble(Logic.lower(a, b));
            case Greater:
                return boolToComplexDouble(Logic.greater(a, b));
            case NotEqual:
                return boolToComplexDouble(Logic.notEqual(a, b));
            case AND:
                return boolToComplexDouble(Logic.and(a, b));
            case OR:
                return boolToComplexDouble(Logic.or(a, b));
        }
        return ComplexDouble.i();
    }

    @Override
    public int argsNum(String name) {
        return 0;
    }

    private ComplexDouble boolToComplexDouble(boolean b){
        return b ? ComplexDouble.one() : ComplexDouble.zero();
    }
}
