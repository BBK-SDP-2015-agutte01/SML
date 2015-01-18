package sml;

import lombok.Getter;
import lombok.AccessLevel;

/**
 * This class is for Branch Not Zero (jump) instructions
 * 
 * 1 register is provided as a constructor argument and is 
 * checked to see if the contents are zero. If not, the statement
 * number provided as the other constructor argument is executed.
 * 
 * @author agutteridge
 */

public class BNZInstruction extends Instruction {

	private int reg;
	private String statement;
	@Getter(AccessLevel.PACKAGE) private boolean zeroStatus;

	public BNZInstruction(String label, String op) {
		super(label, op);
	}

	public BNZInstruction(String label, int reg, String statement) {
		this(label, "BNZ");
		this.reg = reg;
		this.statement = statement;
	}

	@Override
	public void execute(Machine m) {
		if (m.getRegisters().getRegister(reg) == 0) {
			zeroStatus = true;
		} else {
			zeroStatus = false;
		}
	}

	@Override
	public String toString() {
		if (zeroStatus) {
			return super.toString() + " " + reg + " is zero, JUMP to" + statement;			
		} else {
			return super.toString() + " " + reg + " is not zero";
		}
	}
}
