public class Client {

	private Strategy strategy;

	public Client(Strategy strategy){
		this.strategy = strategy;
	}

	public int operation(int operandA, int operandB){
		return strategy.doOperation(operandA, operandB);
	}

}