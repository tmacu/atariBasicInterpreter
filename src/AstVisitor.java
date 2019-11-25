public abstract class AstVisitor<T> {

    public abstract T visit(Expression node);
    public abstract T visit(PrintStatement node);
    public abstract T visit(IfStatement node);
    public abstract T visit(GotoStatement node);
    public abstract T visit(Statement node);
    public abstract T visit(Number node);
    public abstract T visit(Instruction node);
    public abstract T visit(InfixExpression node);
    public abstract T visit(FunctionExpression node);
    public abstract T visit(NumberExpression node);
    public abstract T visit(UnaryExpression node);
    public abstract T visit(VariableExpression node);
    public abstract T visit(AssignStatement node);
    public abstract T visit(InputStatement node);
    public abstract T visit(TrapStatement node);



    public T visit(Program node) {
        if (node instanceof Expression) {
            return visit((Expression) node);
        } else if (node instanceof NumberExpression) {
            return visit((NumberExpression)node);
        } else if (node instanceof VariableExpression) {
            return visit((VariableExpression)node);
        } else if (node instanceof InputStatement) {
            return visit((InputStatement)node);
        } else if (node instanceof TrapStatement) {
            return visit((TrapStatement)node);
        } else if (node instanceof AssignStatement) {
            return visit((AssignStatement)node);
        } else if (node instanceof FunctionExpression) {
            return visit((FunctionExpression)node);
        } else if (node instanceof UnaryExpression) {
            return visit((UnaryExpression)node);
        } else if (node instanceof PrintStatement) {
            return visit((PrintStatement)node);
        } else if (node instanceof IfStatement) {
            return visit((IfStatement)node);
        } else if (node instanceof GotoStatement) {
            return visit((GotoStatement)node);
        } else if (node instanceof Number) {
            return visit((Number)node);
        } else if (node instanceof Statement){
            return visit((Statement)node);
        } else if (node instanceof Instruction){
            return visit((Instruction)node);
        } else if (node instanceof InfixExpression) {
            return visit((InfixExpression) node);
        } else if (node instanceof Program) {
            node.interpret();
            return null;
        } else {
            System.out.println(node.toString());
            return null;
        }
    }

}
