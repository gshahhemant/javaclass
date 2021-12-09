package com.basic;

import java.util.Scanner;

/*

Write program to find square root  of given number
5 =25

*/
public class FindSquareRoot {

	public static void main(String[] args) {
		
		

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number1");
		double  a = in.nextDouble();
		
				
		double squareRoot=0;
		
		squareRoot = Math.sqrt(a);
		
		
		
		
		System.out.println("square root  of given number is=="+squareRoot );
		

		
	}

}
