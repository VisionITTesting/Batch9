package com.visionit.calc;

import org.junit.Test;

import junit.framework.Assert;

public class testcases {
	
	@Test
	public void t_01_test_add() {
		
		//Step 1: Define Expected values
		int expected = 5;
		
		//Step 2: Perform Operations
		Addition add = new Addition(2,3);
	
		//Step 3: Get Actual Value
		int actual = add.performOperation();
		
		//Step 4: Validation/Checkpoint/Assertion
		Assert.assertEquals(expected, actual);
		
		/*
		if (actual==expected) {
			//Test Case is Passed
			System.out.println("Test case is passed. Expected and Actual matched.");
		}else {
			//Test case is fail
			System.out.println("Test case is Failed. Exected value is: " + expected + " actual value is:" + actual);
			Assert.fail("Test case is Failed. Exected value is: " + expected + " actual value is:" + actual);
		}	*/
		
	}
	
	@Test
	public void t_02_test_average() {
		int num1 = 4;
		int num2 = 2;
		
		//Expected
		int expected = 3;
		
		//Steps to be done
		Average average = new Average(num1,num2);
		int actual = average.performOperations();
	
		//Validation
		Assert.assertEquals(expected, actual);
	}
}
