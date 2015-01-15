package edu.ecu.cs.sle.imp.interpreter;

import edu.ecu.cs.sle.imp.ast.Expression;
import edu.ecu.cs.sle.imp.parser.ParserUtil;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class Interpreter {

	public void interpret(String cmd) {
		Expression expr = ParserUtil.parseExpression(cmd);
		if (expr != null) {
			IntegerValue iv = expr.interpret();
			System.out.println("result = " + iv.getIntValue());
		}
	}
}
