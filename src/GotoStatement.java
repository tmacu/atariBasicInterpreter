public class GotoStatement extends Statement {
    private Expression expression;

    public GotoStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void interpret() {
        Integer label = expression.evaluate().getValue().intValue();
        setProgramCounter(label);
        setJumpFlag();
    }
}
