package com.visionit.calc;

public class Division {
	
	int number1;
	int number2;
	float result;
	
	public Division(int a, int b) {
		number1 = a;
		number2 = b;
	}
	
	public float performOperation() {
		result = number1 / number2;
		return result;
	}

}
