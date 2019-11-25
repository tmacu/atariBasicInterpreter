public class InfixExpression extends Expression {
    private Expression left, right;
    Operator operator;

    public InfixExpression(Expression left, Expression right, Operator operator) {
       this.left = left;
       this.right = right;
       this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }
    public void setLeft(Expression left) {
        this.left = left;
    }
    public Expression getRight() {
        return right;
    }
    public void setRight(Expression right) {
        this.right = right;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public Value evaluate() {
        Double value, leftValue, rightValue;
        leftValue = left.evaluate().getValue();
        rightValue = right.evaluate().getValue();
        switch(operator) {
            case PLUS:
                value = leftValue + rightValue;
                break;
            case MINUS:
                value = leftValue - rightValue;
                break;
            case DIVIDE:
                value = leftValue / rightValue;
                break;
            case MULTIPLY:
                value = leftValue * rightValue;
                break;
            case POWER:
                value = Math.pow(leftValue, rightValue);
                break;
            case AND:
                if (leftValue.compareTo(0.0) == 0 || rightValue.compareTo(0.0) == 0) {
                    value = 0.0;
                } else {
                    value = 1.0;
                }
            case OR:
                if (leftValue.compareTo(0.0) == 0  && rightValue.compareTo(0.0) == 0) {
                    value = 0.0;
                } else {
                    value = 1.0;
                }
                break;
            case EQUAL:
                if (leftValue.compareTo(rightValue) == 0) {
                    value = 1.0;

                } else {
                    value = 0.0;
                }
                break;
            case NOTEQUAL:
                if (leftValue.compareTo(rightValue) != 0) {
                    value = 1.0;

                } else {
                    value = 0.0;
                }
                break;
            case LESSTHAN:
                if (leftValue.compareTo(rightValue) < 0) {
                    value = 1.0;
                } else {
                    value = 0.0;
                }
                break;
            case GREATERTHAN:
                if (leftValue.compareTo(rightValue) > 0) {
                    value = 1.0;
                } else {
                    value = 0.0;
                }
                break;
            case LESSTHANOREQUAL:
            if (leftValue.compareTo(rightValue) < 0 || leftValue.compareTo(rightValue) == 0) {
                value = 1.0;
            } else {
                value = 0.0;
            }
            break;
            case GREATERTHANOREQUAL:
                if (leftValue.compareTo(rightValue) > 0 || leftValue.compareTo(rightValue) == 0) {
                    value = 1.0;
                } else {
                    value = 0.0;
                }
                break;
            default:
                value = 0.0;
        }
        return new Number(value);
    }
}