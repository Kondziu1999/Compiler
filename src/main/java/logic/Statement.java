package logic;

enum StatementType {
    VARIABLEASSIGNMENT,
    EXPRESSION,
    TERM,
    LOGICEXPRESSION,
    LOGICTERM,
    WHILE,
    IF,
    FUNCTIONDECLARATION,
    FUNCTIONCALL
}

public class Statement {
    public ParseTree statementContext;
    public StatementType type;

    public Statement(ParseTree statementContext) {
        this.statementContext = statementContext;
        this.type = StatementType.VARIABLEASSIGNMENT;
    }

    public void evaluate() {
        // TODO: ligic here
    }
}