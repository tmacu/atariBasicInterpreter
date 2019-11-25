public class PrintStatement extends Statement {
    Expression expression;
    VariableExpression variableExpression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }
    public PrintStatement(Expression expression, VariableExpression variableExpression) {
        this.expression = expression;
        this.variableExpression = variableExpression;
    }

    @Override
    public void interpret() {
        if (expression instanceof InfixExpression ||
                expression instanceof NumberExpression ||
                expression instanceof UnaryExpression ||
                expression instanceof FunctionExpression ||
                expression instanceof VariableExpression) {
            System.out.println(expression.evaluate().getValue());
        } else {
            if (variableExpression == null) {
                System.out.println(expression.evaluate().getString());
            } else {
                System.out.print(expression.evaluate().getString());
                System.out.println(variableExpression.evaluate().getValue());
            }
        }

    }

}