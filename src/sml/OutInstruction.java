package sml;

/**
 * This class is for printing instructions
 * 
 * 1 register is provided as a constructor argument and its
 * contents are printed to the console.
 * 
 * @author agutteridge
 */

public class OutInstruction extends Instruction {

	private int reg;

	public OutInstruction(String label, String op) {
		super(label, op);
	}

	public OutInstruction(String label, int reg) {
		this(label, "out");
		this.reg = reg;
	}

	@Override
	public void execute(Machine m) {
		int value = m.getRegisters().getRegister(reg);
		System.out.println(value);
	}

	@Override
	public String toString() {
		return super.toString() + " print contents of " + reg;
	}
}
