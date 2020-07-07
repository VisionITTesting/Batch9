package com.visionit.calc;

import org.junit.Test;

import junit.framework.Assert;
import com.visionit.calc.CubeRoot;
import com.visionit.calc.Percentage;

public class testcases {
	
	
@Test
public void t_03_add() {
	int num1=4;
	int num2=5;
	
	int expected=9;
	Addition add=new Addition(num1,num2);
	int actual=add.PerformOperation();
	Assert.assertEquals(expected, actual);
}
@Test
public void t_04_sub() {
	int num1=15;
	int num2=12;
	int expected=3;
	Sub s=new Sub(num1,num2);
	int actual=s.PerformOperation();
	Assert.assertEquals(expected, actual);
}

@Test

public void t_05_percentage() {
	int num1=20;
	int num2=100;
	
	int expected =20;
	
	Percentage Per =new Percentage(num1,num2);
	int actual=Per.PerformOperation();
	Assert.assertEquals(expected, actual);

	
}
@Test

public void t_06_CubeRoot() {
	 double num1=125;
	 
	 double expected=5;
	 
	 CubeRoot cuberoot=new CubeRoot(num1);
	 double actual=cuberoot.PerformOperation();
	 
	 Assert.assertEquals(expected, actual);
	 
}

@Test
public void t_07_SquareRoot() {
	 int num1=25;
	 int expected=0;
	 SquareRoot sqr=new SquareRoot(num1);
	 int actual=sqr.PerformOperation();
	 
	 Assert.assertEquals(expected, actual);
}


@Test
public void t_08_Log() {
	int num1=20;
	
	int expected=1;
	
	Log L1=new Log(num1);
	int actual=L1.PerformOperation();
	
	Assert.assertEquals(expected, actual);
}
}




