import java.util.*;
public class Instruction extends Program {
    private Integer label;
    private List<Statement> statements = new ArrayList<>();

//    public Instruction(Integer label) {
//        this.label = label;
//    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

   public void addStatement(Statement statement) {
       statements.add(statement);
   }
   public void addToProgram(Program program) {
       program.addInstruction(this);
   }

   @Override
   public void interpret() {
       for (Statement statement : statements) {
           Value eval = new EvalVisitor().visit(statement);
       }
   }

}
