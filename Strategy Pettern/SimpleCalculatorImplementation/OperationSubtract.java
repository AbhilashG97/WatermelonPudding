public class OperationSubtract implements Strategy {
	public int doOperation(int operandA, int operandB){
		return Math.abs(operandA - operandB);
	}
}