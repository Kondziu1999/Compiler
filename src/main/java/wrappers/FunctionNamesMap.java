package wrappers;

import data.ComplexDouble;

public interface FunctionNamesMap {
    boolean contains(String name);
    ComplexDouble mapAndEvaluate(String funcName, ComplexDouble a);
    ComplexDouble mapAndEvaluate(String funcName, ComplexDouble a, ComplexDouble b);
    int argsNum(String name);
}
