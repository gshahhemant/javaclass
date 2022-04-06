package com.objectoriented;

public class TestCalculator {

	public static void main(String args[]) {

		Calculator c = new Calculator();

		c.addTwoNum(100, 200);
		c.addTwoNum(900, 200);
		c.addTwoNum(800, 200);
		c.addTwoNum(700, 200);
		
		c.addNumThree(100, 800, 800);

		System.out.println(c.addTwoNumReturn(100, 200));

	}

}
