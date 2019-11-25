public class VariableExpression extends Expression {
    StringValue variable;

    public VariableExpression(StringValue variable) {
        this.variable = variable;
    }

    @Override
    public Value evaluate() {
       return new Number(getVariable(variable.getString()));
    }
}
