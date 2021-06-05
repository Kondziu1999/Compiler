package data;

import wrappers.FunctionNamesMap;
import wrappers.LogicFunctionsMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Logic {

    public static LogicFunctionsMap map = new LogicFunctionsMap();

    public static boolean and(ComplexDouble a, ComplexDouble b){
        return a.realPart > 0.0 && b.realPart > 0.0;
    }
    public static boolean or(ComplexDouble a, ComplexDouble b){
        return a.realPart > 0.0 || b.realPart > 0.0;
    }
    public static boolean equal(ComplexDouble a, ComplexDouble b) { return a.equals(b); }
    public static boolean not(ComplexDouble a) {return a.realPart == 0.0;}
    public static boolean notEqual(ComplexDouble a, ComplexDouble b) { return !equal(a,b); }
    public static boolean greater(ComplexDouble a, ComplexDouble b) {
        return a.realPart > b.realPart; }
    public static boolean lower(ComplexDouble a, ComplexDouble b) { return a.realPart < b.realPart; }
    public static boolean greaterEqual(ComplexDouble a, ComplexDouble b) { return a.realPart >= b.realPart; }
    public static boolean lowerEqual(ComplexDouble a, ComplexDouble b) { return a.realPart <= b.realPart; }
    public static boolean eval(LogicOperationType logicOperationType, ComplexDouble a, ComplexDouble b){
        switch (logicOperationType){
            case Equal:
                return equal(a,b);
            case GreaterEqual:
                return greaterEqual(a,b);
            case LowerEqual:
                return lowerEqual(a,b);
            case Lower:
                return lower(a,b);
            case Greater:
                return greater(a,b);
            case NotEqual:
                return notEqual(a,b);
            case AND:
                return and(a,b);
            case OR:
                return or(a,b);
            case NOT:
                return not(a);
            default:
                return false;
        }
    }
}
