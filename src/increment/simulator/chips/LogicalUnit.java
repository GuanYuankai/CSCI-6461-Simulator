package increment.simulator.chips;

/**
 * The logical unit. Inside an ALU probably.
 * 
 * The logical unit takes 3 inputs:
 * 		* operand1[width]
 * 		* operand2[width]
 * 		* opcode[TBD] - specifies which operation to take place.
 * The logical unit gives 1 output:
 * 		* result[width]
 * 
 * @author Xu Ke
 *
 */
public class LogicalUnit extends Chip {
	public LogicalUnit(int width) {
		addPort("operand1", width);
		addPort("operand2", width);
		addPort("result", width);
		addPort("opcode", 6);
	}
	
	@Override
	public boolean evaluate() {
		// TODO: put everything here.
		return false;
	}
}
