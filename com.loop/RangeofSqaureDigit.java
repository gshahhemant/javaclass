package com.loop;

import java.util.Scanner;
/*
 * Print square of given range
 */

public class RangeofSqaureDigit {
	public static void main(String[] args) {

		int i = 2;

		Scanner io = new Scanner(System.in);

		System.out.println("Please enter the  range for square numbers: ");
		int range = io.nextInt();

		while (i <= range) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

			i++; // i=i+1
		}

	}
}