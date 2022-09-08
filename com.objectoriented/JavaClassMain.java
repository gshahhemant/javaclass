package com.objectoriented;

public class JavaClassMain {

	public static void main(String[] args) {

		//JavaClass myObj = new JavaClass(); // Create an object of class JavaClass (This will call the constructor)
		JavaClass myObj = new JavaClass(100,200,"Java Class"); // Create an object of class JavaClass (This will call the constructor with three arguments/parameters)
		
		
		myObj.printX();// call the method printX()

		myObj.printY();// call the method printY()

		int sum = myObj.sumofXY();// call the method printY()

		System.out.println("sum of X and Y is::" + sum);

		// OR

		// System.out.println("sum of X and Y is::"+myObj.sumofXY()); Another way to
		// call and print sumofXY method

		String str = myObj.getName();

		System.out.println("Name is ::" + str);

		// OR

		// System.out.println("Name is ::::" + myObj.getName()); Another way to
		// call and print getName method


	}

}
