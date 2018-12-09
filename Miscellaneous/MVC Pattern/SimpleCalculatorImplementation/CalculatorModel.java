// Model 

public class CalculatorModel {

	private int operandA, operandB;
	private String operator;

	public void setOperandA(int operandA){
		this.operandA = operandA;
	}

	public void setOperandB(int operandB){
		this.operandB = operandB;
	}

	public void setOperator(String operator){
		this.operator = operator;
	}

	public int getOperandA(){
		return operandA;
	}

	public int getOperandB(){
		return operandB;
	}

	public String getOperator(){
		return operator;
	}

}