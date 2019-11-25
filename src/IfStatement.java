public class IfStatement extends Statement {
    Expression expression;
    Statement statement;

    public IfStatement(Expression expression, Statement statement) {
        this.expression = expression;
        this.statement = statement;
    }

    @Override
    public void interpret() {
        Double value = expression.evaluate().getValue();
        if (value.compareTo(0.0) == 0.0) {

        } else {
            statement.interpret();
        }
    }
}
