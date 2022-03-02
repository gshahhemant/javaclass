package com.loop;

import java.util.Scanner;

public class Rangeofevensum {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		Scanner io = new Scanner(System.in);

		System.out.println("Please type the rannge for even numbers: ");

		int range = io.nextInt();

		while (i <= range) {
			i = i + 1;
			if (i % 2 == 0) {
				sum = sum + i;

				System.out.print("+" + i);
			}

		

		}
		
		System.out.print("="+sum);
	}
}
