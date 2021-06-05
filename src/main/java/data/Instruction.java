package data;

import java.util.HashMap;

public abstract class Instruction {
    public VariableRegister register;
    public Instruction(VariableRegister register) {
        this.register = register;
    }

    public abstract ComplexDouble Do();

    @Override
    public String toString() {
        return "Instruction{}";
    }

    public void setRegister(VariableRegister register) {
        this.register = register;
    }

    public abstract boolean check();
}
