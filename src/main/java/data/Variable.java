package data;

import java.util.HashMap;

public class Variable implements Argument {
    public String name;
    public VariableRegister register;
    public Variable(String name, VariableRegister register) {
        this.name = name;
        this.register = register;
    }

    @Override
    public ComplexDouble getValue() {
        ComplexDouble value = ComplexDouble.zero();
        if(name.equals("step")){
            return StandardFunctions.step();
        }
        value = register.getValue(name);
        return value;
    }

    @Override
    public void setRegister(VariableRegister register) {
        this.register = register;
    }




    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
