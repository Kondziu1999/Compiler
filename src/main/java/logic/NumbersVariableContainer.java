package logic;

public class NumbersVariableContainer {
    private HashMap<String, Double> variables;

    public boolean containsVariable(String name){
        return variables.containsKey(name);
    }

    public void setVariable(NumberVariable numberVariable){
        if (variables.containsKey(numberVariable.name)){
            variables[numberVariable.name] = numberVariable.value;
            return;
        }

        variables.put(numberVariable.name, numberVariable.value);
    }

    public Double getValue(String varName){
        if (variables.containsKey(varName)) {
            return variables.get(varName);
        }
        
        return null;
    }
}