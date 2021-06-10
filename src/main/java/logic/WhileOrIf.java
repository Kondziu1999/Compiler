package logic;


import data.Logic;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.LinkedList;


public class WhileOrIf {
    public LogicExpression condition;
    public LinkedList<Statement> statements;
    public Boolean shouldRunOnce;
    public ParseTree originalCondition;

    public WhileOrIf(ParseTree condition, Boolean shouldRunOnce, ParseTree codeSection) {
        this.statements = new LinkedList<Statement>();
        this.condition = new LogicExpression(condition);
        this.originalCondition = condition;
        this.shouldRunOnce = shouldRunOnce;



        for (var i = 0; i < codeSection.getChildCount(); i++) {
            var currentElement = codeSection.getChild(i);

            var statement = new Statement(currentElement);
            statements.push(statement);
//            System.out.println(currentElement.getText());
        }
    }

    public void perform() {
        if (shouldRunOnce) {
            if (condition.evaluate()) {
                for (var i = statements.size() - 1; i >= 0; i--) {
                    statements.get(i).evaluate();
                }
            }

            return;
        }

        while (new LogicExpression(originalCondition).evaluate()) {
            for (var i = statements.size() - 1; i >= 0; i--) {
                statements.get(i).evaluate();
            }
        }
    }
}