package com.conditions;

import java.util.Scanner;

/*
 * Finding percentage of three subjects and determining Grade;
 * Grade A = if percentage >= 90
 * Grade B = if percentage >=80 
 * Grade C = if percentage >= 70 
 * Failed = if percentage < 70
 */

public class StudentMarkSheet {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter your name::");
		String str = in.nextLine();

		System.out.println("Enter marks for Subject 1::");
		float m1 = in.nextFloat();

		System.out.println("Enter marks for Subject 2::");
		float m2 = in.nextFloat();

		System.out.println("Enter marks for Subject 3::");
		float m3 = in.nextFloat();

		float psum = m1 + m2 + m3;
		float p = psum / 3;
		System.out.println("Your Average is " + p+"%");

		if (m1 < 70 || m2 < 70 || m3 < 70) {
			System.out.println("You have failed");

		} else if (p >= 90) {
			System.out.println("Your grade is an A");

		} else if (p >= 80) {
			System.out.println("Your grade is an B");

		} else if (p >= 70) {
			System.out.println("Your grade is an C");

		} else if (p < 70) {
			System.out.println("You have Failed");
		}
		in.close();
		System.out.println("Thank you for using our Portal " + str);
	}

}
