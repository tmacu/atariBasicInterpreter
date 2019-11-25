public class StringValue extends Value {
    private String value;
    public StringValue(String value) {
        this.value = value;
    }

    @Override
    public Double getValue() {
       return 6.9;
    }

    @Override
    public String getString() {
        return this.value;
    }
}