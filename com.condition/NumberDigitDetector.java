package com.conditions;

import java.util.Scanner;

/* Program for counting digits of a number. 
 * Just have to set a minimum and maximum for the numbers and set the responses for inputs 
 */

public class NumberDigitDetector {
	public static void main(String[] args) {

		System.out.println("Welcome to the Number Digit Counter Portal!");
		System.out.println("Any Number you enter the Portal will detect how many digits it has!");
		System.out.println("The maximum number for the digits it can detect is 99,999");
		System.out.println();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Number::");
		int num = in.nextInt();

		if (num >= 0 && num <= 9) {
			System.out.println("This Number has One digit");

		} else if (num >= 10  && num <= 99) {
			System.out.println("This Number has Two digits");

		} else if (num >= 100 && num <= 999) {
			System.out.println("This Number has Three digits");

		} else if (num >= 1000 && num <= 9999) {
			System.out.println("This Number has Four digits");

		} else if (num >= 10000 && num <= 99999) {
			System.out.println("This Number has Five digits");

		} else if (num >= 100000) {
			System.out.println("Sorry, the Number has Exceeded the Computer limit");
		}
		in.close();
		System.out.println();
		System.out.println("Thank You for using the Portal!! ");
	}
}
