public class AssignStatement extends Statement {
    private StringValue variable;
    private Expression expression;

    public AssignStatement(StringValue variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public void interpret() {
        Double value = expression.evaluate().getValue();
        addVariable(variable.getString(), value);
    }

}
