public class StringExpression extends Expression {
    private String value;

    public StringExpression(String value) {
        this.value = value;
    }

    @Override
    public Value evaluate() {
        return new StringValue(value);
    }
}
