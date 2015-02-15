package sml;

import static org.junit.Assert.*;

import org.junit.Test;

public class TranslatorTest {

	@Test
	public void testAdd() {
		Translator t = new Translator("null");
		t.line = "add 2 1 1";
		Instruction i = t.getInstruction("f0");
		assertTrue(i instanceof AddInstruction);		
	}
	
	@Test
	public void testAddToString() {
		Translator t = new Translator("null");
		t.line = "add 2 1 1";
		Instruction i = t.getInstruction("f0");
		assertEquals("f0: add 1 + 1 to 2", i.toString());				
	}
	
	@Test
	public void testBnz() {
		Translator t = new Translator("null");
		t.line = "bnz 2 f0";
		Instruction i = t.getInstruction("f1");
		assertTrue(i instanceof BnzInstruction);		
	}
	
	@Test
	public void testBnzToString() {
		Translator t = new Translator("null");
		t.line = "bnz 2 f0";
		Instruction i = t.getInstruction("f1");
		assertEquals("f1: bnz 2? JUMP to 0", i.toString());				
	}
	
	@Test
	public void testDiv() {
		Translator t = new Translator("null");
		t.line = "div 2 1 1";
		Instruction i = t.getInstruction("f0");
		assertTrue(i instanceof DivInstruction);		
	}	
	
	@Test
	public void testDivToString() {
		Translator t = new Translator("null");
		t.line = "div 2 1 1";
		Instruction i = t.getInstruction("f0");
		assertEquals("f0: div 1 / 1 to 2", i.toString());				
	}

	@Test
	public void testLin() {
		Translator t = new Translator("null");
		t.line = "lin 20 5";
		Instruction i = t.getInstruction("f0");
		assertTrue(i instanceof LinInstruction);
	}
	
	@Test
	public void testLinToString() {
		Translator t = new Translator("null");
		t.line = "lin 20 5";
		Instruction i = t.getInstruction("f0");
		assertEquals("f0: lin register 20 value is 5", i.toString());				
	}

	@Test
	public void testMul() {
		Translator t = new Translator("null");
		t.line = "mul 2 1 1";
		Instruction i = t.getInstruction("f0");
		assertTrue(i instanceof MulInstruction);		
	}

	@Test
	public void testMulToString() {
		Translator t = new Translator("null");
		t.line = "mul 2 1 1";
		Instruction i = t.getInstruction("f0");
		assertEquals("f0: mul 1 * 1 to 2", i.toString());				
	}	
	
	@Test
	public void testSub() {
		Translator t = new Translator("null");
		t.line = "sub 2 1 1";
		Instruction i = t.getInstruction("f0");
		assertTrue(i instanceof SubInstruction);		
	}

	@Test
	public void testSubToString() {
		Translator t = new Translator("null");
		t.line = "sub 2 1 1";
		Instruction i = t.getInstruction("f0");
		assertEquals("f0: sub 1 - 1 to 2", i.toString());				
	}
	
}
