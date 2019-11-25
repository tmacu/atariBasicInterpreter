public class Number extends Value {
    private Double value;

    public Number(Double value) {
        this.value = value;
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public String getString() {
        return "Error: Tried to evaluate string";
    }

}