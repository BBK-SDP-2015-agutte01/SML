package sml;

/**
 * This class ....
 * 
 * @author someone
 */

public class LinInstruction extends Instruction {
	private int register;
	private int value;

	public LinInstruction(String label, String opcode) {
		super(label, opcode);
	}

	public LinInstruction(String label, Integer[] intArray) {
		super(label, "lin");
		this.register = intArray[0];
		this.value = intArray[1];

	}

	@Override
	public void execute(Machine m) {
		m.getRegisters().setRegister(register, value);
	}

	@Override
	public String toString() {
		return super.toString() + " register " + register + " value is " + value;
	}
}
