public class TrapStatement extends Statement {
    private Double label;

    public TrapStatement(Double label) {
        this.label = label;
    }

    @Override
    public void interpret() {
        addVariable("TRAP", this.label);
    }
}
