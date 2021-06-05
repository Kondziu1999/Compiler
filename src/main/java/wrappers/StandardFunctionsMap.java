package wrappers;

import data.Argument;
import data.ComplexDouble;
import data.StandardFunctions;

import java.util.Set;

public class StandardFunctionsMap implements FunctionNamesMap{
    private Set<String> funcNames = Set.of("+","-","*","/","%","sin","cos","tan","Im","Re","abs","sqrt","plot","print","setup");
    @Override
    public boolean contains(String name) {
        return funcNames.contains(name);
    }

    @Override
    public ComplexDouble mapAndEvaluate(String funcName, ComplexDouble a) {
        switch (funcName){
            case "sin":
                return StandardFunctions.sin(a);
            case "cos":
                return StandardFunctions.cos(a);
            case "tan":
                return StandardFunctions.tan(a);
            case "Re":
                return StandardFunctions.Re(a);
            case "Im":
                return StandardFunctions.Im(a);
            case "abs":
                return StandardFunctions.abs(a);
            case "sqrt":
                return StandardFunctions.sqrt(a);
        }
        return ComplexDouble.i();
    }

    @Override
    public ComplexDouble mapAndEvaluate(String funcName, ComplexDouble a, ComplexDouble b) {
        switch (funcName){
            case "+":
                return StandardFunctions.add(a,b);
            case "-":
                return StandardFunctions.sub(a,b);
            case "*":
                return StandardFunctions.mul(a,b);
            case "/":
                return StandardFunctions.div(a,b);
            case "%":
                return StandardFunctions.mod(a,b);
        }
        return ComplexDouble.i();
    }

    @Override
    public int argsNum(String name) {
        switch (name){
            case "sin":
            case "cos":
            case "tan":
            case "Re":
            case "Im":
            case "abs":
            case "sqrt":
            case "print":
                return 1;
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                return 2;
            case "plot":
            case "setup":
                return 3;
            default:
                return -1;
        }
    }

    public ComplexDouble mapAndEvaluate(String funcName, Argument[] args){
        switch (funcName){
            case "+":
                return StandardFunctions.add(args[0].getValue(),args[1].getValue());
            case "-":
                return StandardFunctions.sub(args[0].getValue(),args[1].getValue());
            case "*":
                return StandardFunctions.mul(args[0].getValue(),args[1].getValue());
            case "/":
                return StandardFunctions.div(args[0].getValue(),args[1].getValue());
            case "%":
                return StandardFunctions.mod(args[0].getValue(),args[1].getValue());
            case "sin":
                return StandardFunctions.sin(args[0].getValue());
            case "cos":
                return StandardFunctions.cos(args[0].getValue());
            case "tan":
                return StandardFunctions.tan(args[0].getValue());
            case "Re":
                return StandardFunctions.Re(args[0].getValue());
            case "Im":
                return StandardFunctions.Im(args[0].getValue());
            case "abs":
                return StandardFunctions.abs(args[0].getValue());
            case "sqrt":
                return StandardFunctions.sqrt(args[0].getValue());
            case "plot":
                return StandardFunctions.plot(args[0].getValue(), args[1].getValue(), args[2].getValue());
            case "print":
                return StandardFunctions.print(args[0].toString(), args[0].getValue());
            case "setup":
                return StandardFunctions.setup(args[0].getValue(), args[1].getValue(),args[2].getValue());
        }
        return ComplexDouble.i();
    }

}
