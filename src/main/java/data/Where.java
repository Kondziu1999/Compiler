package data;

import java.lang.management.LockInfo;
import java.util.HashMap;

public class Where implements Argument {
    private LogicOperationType operationType;
    private Argument arg1;
    private Argument arg2;
    private VariableRegister localRegister;

    @Override
    public void setRegister(VariableRegister register){
        localRegister = register;
    }
    public Where(LogicOperationType operationType, Argument arg1, Argument arg2) {
        this.operationType = operationType;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }


    public static Where empty(){
        return new Where(LogicOperationType.OR,ComplexDouble.one(),ComplexDouble.one());
    }

    public boolean evaluate(){
        arg1.setRegister(localRegister);
        arg2.setRegister(localRegister);
        return Logic.eval(operationType,arg1.getValue(),arg2.getValue());
    }

    @Override
    public String toString() {
        return "where" + '{' + operationType.toString() + '(' + arg1 + ',' + arg2 + ')' +  '}';
    }

    @Override
    public ComplexDouble getValue() {
        return evaluate() ? ComplexDouble.one() : ComplexDouble.zero();
    }


    @Override
    public boolean isValid() {
        return true;
    }
}
