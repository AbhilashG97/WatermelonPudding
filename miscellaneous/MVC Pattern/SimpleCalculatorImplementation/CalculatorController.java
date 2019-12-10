// Controller

public class CalculatorController {

	private CalculatorModel model;
	private CalculatorView view;

	public void setCaluculatorOperandA(int operandA){
		model.setOperandA(operandA);
	}

	public void setCaluculatorOperandB(int operandB){
		model.setOperandA(operandB);
	}

	public int getCaluculatorOperandA(){
		return model.getOperandA();
	}

	public int getCaluculatorOperandA(int operandA){
		return model.getOperandA();
	}

			

}