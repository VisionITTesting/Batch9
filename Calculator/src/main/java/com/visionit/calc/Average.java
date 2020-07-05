package com.visionit.calc;

public class Average {

	int a;
	int b;
	int result;
	
	public Average(int num1, int num2) {
		a = num1;
		b = num2;
	}
	
	public int performOperations() {
		result = (a+b)/2;
		return result;
	}
}
