package com.basic;

import java.util.Scanner;

/*

Write program to find power of given number 

Example : num1 = 5  poweer=3
output will be 125

*/
public class FindPower {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number1:");
		double num1 = in.nextDouble();

		System.out.println("Enter the power you need for  number1:");
		double numPower = in.nextDouble();

		double ans = Math.pow(num1, numPower);

		System.out.println("power of number" + num1 + " is " + ans);

	}

}
