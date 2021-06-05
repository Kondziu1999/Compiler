package data;

import plotter.MatrixAggregator;
import plotter.Plotter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class FunctionCallHeader extends Instruction implements Argument {
    public String funcName;
    public Argument[] args;

    public FunctionCallHeader(String funcName, Argument[] args, VariableRegister parentRegister) {
        super(new VariableRegister(parentRegister));
        this.funcName = funcName;
        this.args = args;
    }

    @Override
    public ComplexDouble getValue() {
        return Do();
    }

    @Override
    public void setRegister(VariableRegister reg) {
        this.register = new VariableRegister(reg);
        for (var arg: args) {
            arg.setRegister(reg);
        }
    }

    @Override
    public boolean isValid() {
        return check();
    }

    @Override
    public boolean check() {
        boolean correctName =  StandardFunctions.map.contains(funcName) ||
                FunctionRegister.getInstance().containsFunction(funcName,args.length);
        if(!correctName) {
            System.out.println("Cannot resolve: " + toString());
            return false;
        }
        for (var arg: args) {
            if(!arg.isValid()){
                return false;
            }
        }

        return  true;
    }


    @Override
    public ComplexDouble Do() {
        if(StandardFunctions.map.contains(funcName)) {
            for(var arg : args){
                arg.setRegister(register);
            }
            var val = StandardFunctions.map.mapAndEvaluate(funcName, args);
            return val;
        }
        else {
            var returnVal = new ComplexDouble(0.0, 0.0);
            putHeaderVariablesIntoRegister();
            FunctionBody body = getBody();
            for(var ins : body.instructions){
                ins.setRegister(register);
                returnVal = ins.Do();
            }
            return returnVal;
        }
    }
    private FunctionBody getBody(){
        return FunctionRegister.getInstance().getFunctionBody(this,register);
    }
    private void putHeaderVariablesIntoRegister(){

        var headers = FunctionRegister.getInstance().getFunctionHeader(funcName,args.length);
        for(int i=0;i<args.length;i++){
            args[i].setRegister(register.getParentRegister());
            register.putVariable(headers[i], args[i].getValue());
        }
    }
    @Override
    public String toString() {
        var str = new StringBuilder();
        str.append(funcName).append('(');
        for (var arg: args) {
            str.append(arg.toString());
            str.append(", ");
        }
        var last = str.lastIndexOf(", ");
        if(args.length >= 1){
            str.deleteCharAt(last+1);
            str.deleteCharAt(last);
        }
        str.append(')');
        str.append('/');
        str.append(args.length);
        return str.toString();
    }
}
