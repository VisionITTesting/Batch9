package com.visionit.calc;

public class Substraction extends AbstractOperations {

	public Substraction(int num1,int num2) {
		super.num1 = num1;
		super.num2 = num2;
	}
	
	private void performSubOps() {
		super.result = super.num1 - super.num2;
	}
	
	@Override
	protected void performOperation() {
		performSubOps();
	}

}
