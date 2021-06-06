package logic;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.LinkedList;

public class Function {
    public String name;
    public LinkedList<Statement> statements;

    public Function(String name, ParseTree codeSection) {
        this.statements = new LinkedList<Statement>();
        this.name = name;

        for (var i = 0; i < codeSection.getChildCount(); i++) {
            var currentElement = codeSection.getChild(i);

            var statement = new Statement(currentElement);
            statements.push(statement);
        }
    }

    public void perform() {
        for (var i = statements.size() - 1; i >= 0; i--) {
            statements.get(i).evaluate();
        }
    }
}