public class NumberExpression extends Expression {
    Double value;

    public NumberExpression(Double value) {
       this.value = value;
    }

    @Override
    public Value evaluate() {
       return new Number(value);
    }
}
