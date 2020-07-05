package com.visionit.calc;

public class Multiply {
	
	int number1;
	int number2;
	int result;
	
	public Multiply(int a, int b) {
		number1 = a;
		number2 = b;
	}
	
	public int performOperation() {
		result = number1 * number2;
		return result;
	}

}
