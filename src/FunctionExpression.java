import java.math.*;
public class FunctionExpression extends Expression {
   Expression expression;
   Operator operator;

   public FunctionExpression(Expression expression, Operator operator) {
       this.expression = expression;
       this.operator = operator;
   }

    @Override
    public Value evaluate() {
        Double value;
        value = expression.evaluate().getValue();
        switch (operator) {
            case INT:
                value = Math.floor(value);
                break;
            case SGN:
                value = Double.valueOf(value.compareTo(0.0));
                break;
            case SQR:
                value = Math.sqrt(value);
                break;
            case ABS:
                value = Math.abs(value);
                break;
            case SIN:
                value = Math.sin(value);
                break;
            case COS:
                value = Math.cos(value);
                break;
            case EXP:
                value = Math.exp(value);
                break;
            case LOG:
                value = Math.log(value);
                break;
            case CLOG:
                value = Math.log10(value);
                break;
            default:
                value = 0.0;
        }
        return new Number(value);
    }
}
