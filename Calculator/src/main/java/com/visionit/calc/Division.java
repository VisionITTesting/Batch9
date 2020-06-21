package com.visionit.calc;

public class Division extends AbstractOperations {

	public Division(int num1,int num2) {
		super.num1 = num1;
		super.num2 = num2;
	}
	
	private void performDivision() {
		super.result = super.num1 / super.num2;
	}
	
	@Override
	protected void performOperation() {
		performDivision();
	}

}
