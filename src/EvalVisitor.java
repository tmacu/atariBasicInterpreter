public class EvalVisitor extends AstVisitor<Value> {

    @Override
    public Value visit(Instruction node) {
        node.interpret();
        return null;
    }
    @Override
    public Value visit(Statement node) {
        node.interpret();
        return null;
    }
    @Override
    public Value visit(Expression node) {
        return null;
    }
    @Override
    public Value visit(InfixExpression node) {
        return node.evaluate();
    }
    @Override
    public Value visit(FunctionExpression node) {
        return node.evaluate();
    }
    @Override
    public Value visit(UnaryExpression node) {
        return node.evaluate();
    }

    @Override
    public Value visit(NumberExpression node) {
        return node.evaluate();
    }

    @Override
    public Value visit(VariableExpression node) {
        return node.evaluate();
    }

    @Override
    public Value visit(Number node) {
        return null;
    }

    @Override
    public Value visit(PrintStatement node) {
        node.interpret();
        return null;
    }
    @Override
    public Value visit(IfStatement node) {
        node.interpret();
        return null;
    }

    @Override
    public Value visit(GotoStatement node) {
        node.interpret();
        return null;
    }

    @Override
    public Value visit(TrapStatement node) {
        node.interpret();
        return null;
    }

    @Override
    public Value visit(AssignStatement node) {
        node.interpret();
        return null;
    }

    @Override
    public Value visit(InputStatement node) {
        node.interpret();
        return null;
    }

}