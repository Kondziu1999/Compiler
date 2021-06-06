package logic;


import java.util.LinkedList;

public class FunctionsContainer {
    private static LinkedList<Function> functions = new LinkedList<Function>();

    public static void addFunction(Function function){
        functions.push(function);
    }

    public static Function getFunctionByName(String funName){
        return functions.stream()
        .filter((animal) -> animal.name.equals(funName))
        .findFirst().get();
    }
}