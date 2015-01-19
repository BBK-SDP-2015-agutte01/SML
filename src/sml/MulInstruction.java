package sml;

/**
 * This class is for multiplication instructions
 * 
 * 3 registers are provided as cons arguments and specify
 * the locations of the 2 operands and the result
 * 
 * @author agutteridge
 */

public class MulInstruction extends Instruction {

	private int result;
	private int op1;
	private int op2;

	public MulInstruction(String label, String op) {
		super(label, op);
	}

	public MulInstruction(String label, Integer[] intArray) {
		this(label, "mul");
		this.result = intArray[0];
		this.op1 = intArray[1];
		this.op2 = intArray[2];
	}
	
	@Override
	public void execute(Machine m) {
		int value1 = m.getRegisters().getRegister(op1);
		int value2 = m.getRegisters().getRegister(op2);
		m.getRegisters().setRegister(result, value1 * value2);
	}

	@Override
	public String toString() {
		return super.toString() + " " + op1 + " * " + op2 + " to " + result;
	}
}
