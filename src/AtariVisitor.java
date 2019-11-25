// Generated from /home/fatjoker/IdeaProjects/AtariBasic/novisitor/Atari.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AtariParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AtariVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AtariParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AtariParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtariParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(AtariParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementTodo}
	 * labeled alternative in {@link AtariParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTodo(AtariParser.StatementTodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sPrint}
	 * labeled alternative in {@link AtariParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSPrint(AtariParser.SPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sList}
	 * labeled alternative in {@link AtariParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSList(AtariParser.SListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sGoto}
	 * labeled alternative in {@link AtariParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSGoto(AtariParser.SGotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sInput}
	 * labeled alternative in {@link AtariParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSInput(AtariParser.SInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sTrap}
	 * labeled alternative in {@link AtariParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTrap(AtariParser.STrapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sIf}
	 * labeled alternative in {@link AtariParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIf(AtariParser.SIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sAssignValue}
	 * labeled alternative in {@link AtariParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSAssignValue(AtariParser.SAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eUnaryMinus}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEUnaryMinus(AtariParser.EUnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eNot}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitENot(AtariParser.ENotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eMathFunction}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEMathFunction(AtariParser.EMathFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ePower}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEPower(AtariParser.EPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eRelop}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitERelop(AtariParser.ERelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eOr}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEOr(AtariParser.EOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eAnd}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEAnd(AtariParser.EAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eNumber}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitENumber(AtariParser.ENumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eVariable}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEVariable(AtariParser.EVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eInfixExpression}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEInfixExpression(AtariParser.EInfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eBrackets}
	 * labeled alternative in {@link AtariParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEBrackets(AtariParser.EBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fPrintSemicolonVariable}
	 * labeled alternative in {@link AtariParser#fPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFPrintSemicolonVariable(AtariParser.FPrintSemicolonVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fPrintString}
	 * labeled alternative in {@link AtariParser#fPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFPrintString(AtariParser.FPrintStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fPrintNewLine}
	 * labeled alternative in {@link AtariParser#fPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFPrintNewLine(AtariParser.FPrintNewLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fPrintExpression}
	 * labeled alternative in {@link AtariParser#fPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFPrintExpression(AtariParser.FPrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fPrintVariable}
	 * labeled alternative in {@link AtariParser#fPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFPrintVariable(AtariParser.FPrintVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fListAll}
	 * labeled alternative in {@link AtariParser#fList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFListAll(AtariParser.FListAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fListNumber}
	 * labeled alternative in {@link AtariParser#fList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFListNumber(AtariParser.FListNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fListSpan}
	 * labeled alternative in {@link AtariParser#fList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFListSpan(AtariParser.FListSpanContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtariParser#fGoto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFGoto(AtariParser.FGotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtariParser#fInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFInput(AtariParser.FInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtariParser#fTrap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFTrap(AtariParser.FTrapContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtariParser#fIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFIf(AtariParser.FIfContext ctx);
}