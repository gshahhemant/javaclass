package com.loop;

import java.util.Scanner;
/*
 * Print even numbers from given range
 */

public class RangeofEvenDigit {
	public static void main(String[] args) {

		int i = 2;

		Scanner io = new Scanner(System.in);

		System.out.println("Please the range for even numbers: ");
		int range = io.nextInt();

		while (i <= range) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

			i++; // i=i+1
		}

	}
}