package logic;

public class Function {
    public String name;
    public List<Statement> statements;

    public Function(String name, ParseTree codeSection) {
        this.statements = new List<Statement>();
        this.name = name;

        for (var i = 0; i < codeSection.getChildCount(); i++) {
            var currentElement = codeSection.getChild(i);

            var statement = new Statement(currentElement);
            statements.push(statement);
        }
    }

    public void perform() {
        for (var i = 0; i < statements.length; i++) {
            statements[i].evaluate();
        }
    }
}