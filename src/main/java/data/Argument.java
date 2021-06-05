package data;

import java.util.HashMap;

public interface Argument {
    ComplexDouble getValue();
    void setRegister(VariableRegister register);
    boolean isValid();
}
