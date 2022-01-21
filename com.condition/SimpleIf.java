package com.condition;

import java.util.Scanner;
// Simple If condition
public class SimpleIf {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter number1:: ");
		int num1 = in.nextInt();

		System.out.println("Enter number 2:: ");
		int num2 = in.nextInt();

		if (num1 > num2) {

			System.out.println("number1 is largest");

		}

		if (num2 > num1) {

			System.out.println("number2 is largest");

		}

		if (num2 == num1) {

			System.out.println("Both are equal");

		}
				
		System.out.println("Hi Aayushi");
		
	}

}
