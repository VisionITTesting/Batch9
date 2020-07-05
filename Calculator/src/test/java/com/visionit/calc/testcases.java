package com.visionit.calc;

import org.junit.Test;

public class testcases {
	
	@Test
	public void t_01_test_add() {
		Division d  = new Division(9,2);
		System.out.println(d.performOperation());
		
	}
}
