public class UnaryExpression extends Expression {
    Expression expression;
    Operator operator;

    public UnaryExpression(Expression expression, Operator operator) {
        this.expression = expression;
        this.operator = operator;
    }
    @Override
    public Value evaluate() {
        Double value;
        value = expression.evaluate().getValue();
        switch (operator) {
            case NOT:
                if (value.compareTo(0.0) == 0) {
                    value = 1.0;
                } else
                    value = 0.0;
                break;
            case MINUS:
                value = -value;
        }
        return new Number(value);
    }
}
