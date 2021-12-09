package com.basic;

import java.util.Scanner;

/*

Write program to find square of given number
5 =25

*/
public class FindSquareForNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("You entered integer ");
		int a = in.nextInt();
		
		int square=0;
		
		square = a * a;
		
		
		
		System.out.println("square of given number is=="+square );
		


	}

}
