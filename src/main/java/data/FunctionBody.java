package data;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionBody {
    public ArrayList<Instruction> instructions;

    public FunctionBody() {
        this.instructions = new ArrayList<>();
    }
    public ComplexDouble evaluate(VariableRegister register){
        var result = ComplexDouble.zero();
        for(var ins : instructions){
            ins.setRegister(register);
            result = ins.Do();
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Body{\n");
        for (var inst: instructions) {
            builder.append("    " + inst.toString());
            builder.append('\n');
        }
        builder.append('}');
        return builder.toString();
    }
}
