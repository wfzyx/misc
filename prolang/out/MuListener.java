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
	 * Enter a parse tree produced by {@link MuParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(MuParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(MuParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#assignables}.
	 * @param ctx the parse tree
	 */
	void enterAssignables(MuParser.AssignablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#assignables}.
	 * @param ctx the parse tree
	 */
	void exitAssignables(MuParser.AssignablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#gen_attr}.
	 * @param ctx the parse tree
	 */
	void enterGen_attr(MuParser.Gen_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#gen_attr}.
	 * @param ctx the parse tree
	 */
	void exitGen_attr(MuParser.Gen_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#expr_block}.
	 * @param ctx the parse tree
	 */
	void enterExpr_block(MuParser.Expr_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#expr_block}.
	 * @param ctx the parse tree
	 */
	void exitExpr_block(MuParser.Expr_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MuParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MuParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void enterFun_decl(MuParser.Fun_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#fun_decl}.
	 * @param ctx the parse tree
	 */
	void exitFun_decl(MuParser.Fun_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#fun_call}.
	 * @param ctx the parse tree
	 */
	void enterFun_call(MuParser.Fun_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#fun_call}.
	 * @param ctx the parse tree
	 */
	void exitFun_call(MuParser.Fun_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(MuParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(MuParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#match_cond}.
	 * @param ctx the parse tree
	 */
	void enterMatch_cond(MuParser.Match_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#match_cond}.
	 * @param ctx the parse tree
	 */
	void exitMatch_cond(MuParser.Match_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#match_branch}.
	 * @param ctx the parse tree
	 */
	void enterMatch_branch(MuParser.Match_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#match_branch}.
	 * @param ctx the parse tree
	 */
	void exitMatch_branch(MuParser.Match_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#ret_call}.
	 * @param ctx the parse tree
	 */
	void enterRet_call(MuParser.Ret_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#ret_call}.
	 * @param ctx the parse tree
	 */
	void exitRet_call(MuParser.Ret_callContext ctx);
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
	 * Enter a parse tree produced by {@link MuParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(MuParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(MuParser.Expr_atomContext ctx);
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
	 * Enter a parse tree produced by {@link MuParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(MuParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(MuParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#compar_op}.
	 * @param ctx the parse tree
	 */
	void enterCompar_op(MuParser.Compar_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#compar_op}.
	 * @param ctx the parse tree
	 */
	void exitCompar_op(MuParser.Compar_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MuParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op(MuParser.Binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op(MuParser.Binary_opContext ctx);
}