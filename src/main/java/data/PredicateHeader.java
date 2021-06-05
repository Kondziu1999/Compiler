package data;

import java.util.Arrays;
import java.util.Objects;

public class PredicateHeader {
    private String name;
    private String[] inputs;

    public PredicateHeader(String name, String[] inputs) {
        this.name = name;
        this.inputs = inputs;
    }

    public String getName() {
        return name;
    }

    public String[] getInputs(){
        return inputs;
    }
    @Override
    public String toString() {
        return name + '(' + String.join(",",inputs) + ')' + '/' + inputs.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PredicateHeader that = (PredicateHeader) o;
        return Objects.equals(name, that.name) && inputs.length == that.inputs.length;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + inputs.length;
        return result;
    }
}
