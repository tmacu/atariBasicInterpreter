import org.antlr.v4.misc.OrderedHashMap;
import java.util.*;

public class CstVisitor extends AtariBaseVisitor<Program> {
    /** prog */
    @Override
    public Program visitProg(AtariParser.ProgContext ctx) {
        Integer childCount = ctx.getChildCount();
        Program program = new Program();
        for (int it = 0; it < childCount - 1; it++) {
           program.addInstruction((Instruction)visit(ctx.instruction(it)));
        }
        return program;
    }

    /** instruction */
    @Override
    public Program visitInstruction(AtariParser.InstructionContext ctx) {
        Integer childCount = ctx.getChildCount();
        Instruction instruction = new Instruction();
        instruction.setLabel(Integer.valueOf(ctx.NUMBER().getText()));
        for (Integer it = 1; it < childCount - 1; it = it + 2) {
           instruction.addStatement((Statement)visit(ctx.getChild(it)));
        }
        return instruction;
    }

    /** print string */
    @Override
    public Program visitFPrintString(AtariParser.FPrintStringContext ctx) {
        return new PrintStatement(new StringExpression(ctx.STRING().toString()));
    }

    /** print variable */
    @Override
    public Program visitFPrintVariable(AtariParser.FPrintVariableContext ctx) {
        return new PrintStatement(new StringExpression(ctx.VAR().toString()));
    }

    /** print expression */
    @Override
    public Program visitFPrintExpression(AtariParser.FPrintExpressionContext ctx) {
        return new PrintStatement((Expression)visit(ctx.expr()));
    }

    /** print newline */
    @Override
    public Program visitFPrintNewLine(AtariParser.FPrintNewLineContext ctx) {
        return new PrintStatement(new StringExpression(""));
    }

    /** print semicolonvariable */
    @Override
    public Program visitFPrintSemicolonVariable(AtariParser.FPrintSemicolonVariableContext ctx) {
        return new PrintStatement(new StringExpression(ctx.STRING().getText()), new VariableExpression(new StringValue(ctx.VAR().toString())));
    }

    /** brackets */
    @Override
    public Program visitEBrackets(AtariParser.EBracketsContext ctx) {
        return visit(ctx.expr());
    }

    /** unary minus */
    @Override
    public Program visitEUnaryMinus(AtariParser.EUnaryMinusContext ctx) {
        return new UnaryExpression((Expression)visit(ctx.expr()), Operator.MINUS);
    }

    /** power */
    @Override
    public Program visitEPower(AtariParser.EPowerContext ctx) {
        return new InfixExpression((Expression)visit(ctx.expr(0)),
                (Expression)visit(ctx.expr(1)),
                Operator.POWER);
    }

    /** add sub expression */
    @Override
    public Program visitEInfixExpression(AtariParser.EInfixExpressionContext ctx) {
        return new InfixExpression((Expression)visit(ctx.expr(0)),
                (Expression)visit(ctx.expr(1)),
                Operator.fromInt(ctx.op.getType()));
    }

    /** relation */
    @Override
    public Program visitERelop(AtariParser.ERelopContext ctx) {
        return new InfixExpression((Expression)visit(ctx.expr(0)),
                (Expression)visit(ctx.expr(1)),
                Operator.fromInt(ctx.op.getType()));
    }

    /** not */
    @Override
    public Program visitENot(AtariParser.ENotContext ctx) {
        return new UnaryExpression((Expression)visit(ctx.expr()), Operator.NOT);
    }

    /** and */
    @Override
    public Program visitEAnd(AtariParser.EAndContext ctx) {
        return new InfixExpression((Expression)visit(ctx.expr(0)), (Expression)visit(ctx.expr(1)), Operator.AND);
    }

    /** or */
    @Override
    public Program visitEOr(AtariParser.EOrContext ctx) {
        return new InfixExpression((Expression)visit(ctx.expr(0)), (Expression)visit(ctx.expr(1)), Operator.OR);
    }

    /** function */
    @Override
    public Program visitEMathFunction(AtariParser.EMathFunctionContext ctx) {
        return new FunctionExpression((Expression)visit(ctx.expr()), Operator.fromInt(ctx.fun.getType()));
    }

    /** number */
    @Override
    public Program visitENumber(AtariParser.ENumberContext ctx) {
        return new NumberExpression(Double.valueOf(ctx.NUMBER().getText()));
    }

    /** variable */
    @Override
    public Program visitEVariable(AtariParser.EVariableContext ctx) {
        return new VariableExpression(new StringValue(ctx.VAR().getText()));
    }

    /** goto */
    @Override
    public Program visitFGoto(AtariParser.FGotoContext ctx) {
        return new GotoStatement((Expression)visit(ctx.expr()));
    }

    /** input */
    @Override
    public Program visitFInput(AtariParser.FInputContext ctx) {
        return new InputStatement(new StringValue(ctx.VAR().getText()));
    }

    /** trap */
    @Override
    public Program visitFTrap(AtariParser.FTrapContext ctx) {
        return new TrapStatement(Double.valueOf(ctx.NUMBER().getText()));
    }

    /** statement if */
    @Override
    public Program visitSIf(AtariParser.SIfContext ctx) {
       return visit(ctx.fIf());
    }

    /** if */
    @Override
    public Program visitFIf(AtariParser.FIfContext ctx) {
        return new IfStatement((Expression)visit(ctx.expr()), (Statement)visit(ctx.statement()));
    }

    /** assign */
    @Override
    public Program visitSAssignValue(AtariParser.SAssignValueContext ctx) {
        return new AssignStatement(new StringValue(ctx.VAR().getText()), (Expression)visit(ctx.expr()));
    }
}
