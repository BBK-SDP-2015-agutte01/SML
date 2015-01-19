package sml;

/**
 * This class is for Branch Not Zero (jump) instructions
 * 
 * 1 register is provided as a constructor argument and is 
 * checked to see if the contents are zero. If not, the statement
 * number provided as the other constructor argument is executed.
 * 
 * @author agutteridge
 */

public class BnzInstruction extends Instruction {

	private int reg;
	private int statement;

	public BnzInstruction(String label, String op) {
		super(label, op);
	}

	public BnzInstruction(String label, Integer[] intArray) {
		this(label, "bnz");
		this.reg = intArray[0];
		this.statement = intArray[1];
	}

	@Override
	public void execute(Machine m) {
		if (m.getRegisters().getRegister(reg) != 0) {			
			Labels labelObject = m.getLabels();
			int newPc = labelObject.indexOf("f" + statement);
			m.setPc(newPc);
		}
	}

	@Override
	public String toString() {
		return super.toString() + " " + reg + "? JUMP to " + statement;			
	}
}
