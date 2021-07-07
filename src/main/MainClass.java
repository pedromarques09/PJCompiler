package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import exceptions.PjSemanticException;
import parser.PjLangLexer;
import parser.PjLangParser;

/* esta e a classe que e responsavel por criar a interacao com o usuario
 * instanciando nosso parser e apontando para o arquivo fonte
 * 
 * Arquivo fonte: extensao.pj
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		try {
			PjLangLexer lexer;
			PjLangParser parser;
			
			// leio o arquivo "input.pj" e isso e entrada para o Analisador Lexico
			lexer = new PjLangLexer(CharStreams.fromFileName("input.pj"));
			
			// crio um "fluxo de tokens" para passar para o PARSER
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// crio meu parser a partir desse tokenStream
			parser = new PjLangParser(tokenStream);
			
			parser.prog();
			
			System.out.println("Programa compilado com sucesso");
			
			//parser.exibeComandos();
			
			parser.generateCode();
			
		}
		catch(PjSemanticException ex) {
			System.err.println("Erro Semantico - "+ex.getMessage());
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.err.println("ERRO "+ex.getMessage());
		}
		
	}

}
