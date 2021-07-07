// Generated from PJLang.g4 by ANTLR 4.4

	import datastructures.PjSymbol;
	import datastructures.PjVariable;
	import datastructures.PjSymbolTable;
	import exceptions.PjSemanticException;
	import ast.PjProgram;
	import ast.AbstractCommand;
	import ast.CommandLeitura;
	import ast.CommandEscrita;
	import ast.CommandAtribuicao;
	import ast.CommandDecisao;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PJLangParser}.
 */
public interface PJLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PJLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(@NotNull PJLangParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(@NotNull PJLangParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull PJLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull PJLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull PJLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull PJLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull PJLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull PJLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(@NotNull PJLangParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(@NotNull PJLangParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull PJLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull PJLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(@NotNull PJLangParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(@NotNull PJLangParser.CmdselecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PJLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PJLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull PJLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull PJLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull PJLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull PJLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(@NotNull PJLangParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(@NotNull PJLangParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PJLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(@NotNull PJLangParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(@NotNull PJLangParser.CmdleituraContext ctx);
}