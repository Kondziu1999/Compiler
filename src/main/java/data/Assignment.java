package data;

import java.util.HashMap;

public class Assignment extends Instruction {

    private String varName;
    private Argument assignment;
    public Assignment(VariableRegister register, String varName, Argument assignment) {
        super(register);
        this.varName = varName;
        this.assignment = assignment;
    }

    @Override
    public ComplexDouble Do() {
        assignment.setRegister(register);
        var assignmentValue = assignment.getValue();
        register.putVariable(varName,assignmentValue);
        return assignmentValue;
    }

    @Override
    public String toString() {
        return  varName + " = " + assignment;
    }

    @Override
    public boolean check() {
        return assignment.isValid();
    }

}
