package edu.ecu.cs.sle.imp.interpreter;

import java.io.IOException;
import java.io.StringReader;

import beaver.Parser;
import edu.ecu.cs.sle.imp.ast.Expression;
import edu.ecu.cs.sle.imp.parser.ExpressionParser;
import edu.ecu.cs.sle.imp.parser.ExpressionScanner;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class Interpreter {

	private final ExpressionParser parser;
	
	public Interpreter() {
		parser = new ExpressionParser();
	}
	
	public void interpret(String cmd) {
		ExpressionScanner scanner = new ExpressionScanner(new StringReader(cmd));
		try {
			Expression expr = (Expression) parser.parse(scanner);
			IntegerValue iv = expr.interpret();
			System.out.println("result = " + iv.getIntValue());
		} catch (Parser.Exception | IOException e) {
			System.err.println("Error, could not parse expression, make sure your syntax is correct: " + e.toString());
		}
	}
}
