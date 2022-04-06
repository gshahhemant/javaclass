package com.objectoriented;

public class Calculator {

	/*
	 * addTwoNum is function name. int num1 and int num2 is arguments. public is
	 * access modifier. void is return type . Void means nothing
	 */

	public void addTwoNum(int num1, int num2) {

		int sum = num1 + num2;

		System.out.println(sum);

	}

	public int addTwoNumReturn(int num1, int num2) {

		int sum = num1 + num2;

		return sum;

	}

	public void addNumThree(int num1, int num2, int num3) {

		int sum = num1 + num2 + num3;

		System.out.println(sum);

	}

}
