import java.util.Scanner;
public class InputStatement extends Statement {
    StringValue variable;

    public InputStatement(StringValue variable) {
        this.variable = variable;
    }

    @Override
    public void interpret() {
        Scanner scan = new Scanner(System.in);
        Double value = scan.nextDouble();
        addVariable(variable.getString(), value);

    }
}
