package com.basic;

import java.util.Scanner;

/*
 * Find Average of three numbers.
 * hint: sum of all three numbers/3
 */

public class FindAverageofThreeNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter Number1 ");
		double num1 = in.nextInt();

		System.out.println("Enter Number1 ");
		double num2 = in.nextInt();

		System.out.println("Enter Number3 ");
		double num3 = in.nextInt();

		/*
		 * (num1+ num2+ num3) square brackets are required else it will divide first
		 * num/3 and than add with num1 and num2
		 * 
		 * / has high precedence over +
		 * 
		 */

		double avg = (num1 + num2 + num3) / 3;

		System.out.println("Average of  three number is:: " + avg);

		in.close();

	}

}
