package logic;

import java.util.HashMap;

public class FunctionsContainer {
    private static List<Function> functions = new List<Function>();

    public static void addFunction(Function function){
        functions.push(function);
    }

    public static Function getFunctionByName(String funName){
        return functions.stream()
        .filter((animal) -> animal.name == funName)
        .findFirst();
    }
}