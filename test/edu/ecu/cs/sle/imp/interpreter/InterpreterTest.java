package edu.ecu.cs.sle.imp.interpreter;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class InterpreterTest {

	private static Interpreter interpreter;
	
	@BeforeClass
	public static void setUpClass() {
		interpreter = new Interpreter();
	}
	
	@Test
	public void testMultiply() {
		IntegerValue iv = interpreter.interpret("1*2");
		assertEquals("1*2", 2, iv.getIntValue().intValue());
	}	
	
	@Test
	public void testAddition() {
		IntegerValue iv = interpreter.interpret("3+4");
		assertEquals("3+4", 7, iv.getIntValue().intValue());
	}
	
	@Test
	public void testSubtraction() {
		IntegerValue iv = interpreter.interpret("6-5");
		assertEquals("6-5", 1, iv.getIntValue().intValue());
	}
	
	@Test
	public void testDivison() {
		IntegerValue iv = interpreter.interpret("4/2");
		assertEquals("4/2", 2, iv.getIntValue().intValue());
	}
	
	@Test
	public void testUnaryMinus() {
		IntegerValue iv = interpreter.interpret("-1");
		assertEquals("-1", -1, iv.getIntValue().intValue());
	}	
	
}
