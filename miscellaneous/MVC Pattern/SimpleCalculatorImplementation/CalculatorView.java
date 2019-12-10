//View

import java.io.*;

public class CalculatorView {

	public void displayResult(int result){
		System.out.println("The result of the operation is : "+result);
	}

	public void invalidOperatorError(){
		System.err.println("Enter a valid operator");
	}

	public void invalidNumberOfOperators(){
		System.err.println("Invalid number of operators entered");
	}

}