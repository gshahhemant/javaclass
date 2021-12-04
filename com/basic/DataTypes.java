package com.basic;
	
	/*
	byte	1 byte	Stores whole numbers from -128 to 127
	short	2 bytes	Stores whole numbers from -32,768 to 32,767
	int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
	long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
	boolean	1 bit	Stores true or false values
	char	2 bytes	Stores a single character/letter or ASCII values
   */

public class DataTypes {
	public static void main(String[] args) {

		int num1 = 1000;

		long num3 = 2323232132l;

		float num2 = 100.50f;

		double num4 = 32323213213.67;

		boolean flag = true;

		String str = "fddhjfkhdjfkhdjkfhdjfkhdjfkh";

		char ch = 'H';

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(flag);
		System.out.println(str);
		System.out.println(ch);

	}

}
