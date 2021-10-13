// Generated from Mu.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuParser}.
 */
public interface MuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MuParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(MuParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(MuParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(MuParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(MuParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(MuParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(MuParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MuParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MuParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(MuParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(MuParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(MuParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(MuParser.Expr_atomContext ctx);
}