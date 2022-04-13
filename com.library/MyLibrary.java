package com.library;

public class MyLibrary {

	public int largestTwoNum(int num1, int num2) {

		if (num1 > num2)

			return num1;
		else
			return num2;
	}

	public String isEven(int num) {

		if (num % 2 == 0) {

			return num + "  is Even";

		} else {
			return num + " is not Even";
		}

	}

	public String isOdd(int num) {

		if (num % 2 != 0) {

			return num + "  is ODD ";

		} else {
			return num + " is not ODD";
		}

	}
	
	public int sumOfDigit(int num1) {
		
		int i = 1;

		int sum = 0;
		
		while (i <= num1) {

			System.out.print(i + "+");

			sum = sum + i;

			i = i + 1;

		}
		
		System.out.print("==");
		return sum;
		
		
	}

}
