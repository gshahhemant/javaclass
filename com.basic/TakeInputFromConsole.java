package com.basic;

import java.util.Scanner;

/*
	Sample Program to take user input from console


*/
public class TakeInputFromConsole {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("You entered string ");
		String s = in.nextLine();

		System.out.println("You entered integer ");

		int a = in.nextInt();

		System.out.println("You entered float ");
		float b = in.nextFloat();
		
		System.out.println("You entered Double ");
		double  d = in.nextDouble();

		in.close();

		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);

	}

}
