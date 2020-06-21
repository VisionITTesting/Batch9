package com.visionit.calc;

public class Multiplication extends AbstractOperations {

	public Multiplication(int num1,int num2) {
		super.num1 = num1;
		super.num2 = num2;
	}
	
	private void performMultipleOps() {
		super.result = super.num1 * super.num2;
	}
	
	@Override
	protected void performOperation() {
		performMultipleOps();
	}

}
