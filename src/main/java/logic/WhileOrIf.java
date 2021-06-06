package logic;

public class WhileOrIf {
    public LogicExpression condition;
    public List<Statement> statements;
    public Boolean shouldRunOnce;

    public WhileOrIf(LogicExpression condition, Boolean shouldRunOnce, ParseTree codeSection) {
        this.statements = new List<Statement>();
        this.condition = condition;
        this.shouldRunOnce = shouldRunOnce;

        for (var i = 0; i < codeSection.getChildCount(); i++) {
            var currentElement = codeSection.getChild(i);

            var statement = new Statement(currentElement);
            statements.push(statement);
        }
    }

    public void perform() {
        if (shouldRunOnce) {
            if (condition.evaluate()) {
                for (var i = 0; i < statements.length; i++) {
                    statements[i].evaluate();
                }
            }

            return;
        }

        while (condition.evaluate()) {
            for (var i = 0; i < statements.length; i++) {
                statements[i].evaluate();
            }
        }
    }
}