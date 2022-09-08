package com.objectoriented;

public class JavaClass {

	int x; // Create a class attribute
	int y;
	String name;

	// Create a class constructor for the JavaClass class
	public JavaClass() {
		x = 5; // Set the initial value for the class attribute x
		y = 10; // Set the initial value for the class attribute y
		name = "Java Class";
	}

	// Create a class constructor with three arguments/parameters
	public JavaClass(int x1, int y1, String name1) {

		x = x1;
		y = y1;
		name = name1;
	}

	public void printX() {

		System.out.println("Value Of X is ::" + x);

	}

	public void printY() {

		System.out.println("Value Of Y is ::" + y);

	}

	public int sumofXY() {

		int sum = x + y;

		return sum;

	}

	public String getName() {

		return name;

	}

	// You can create main method in same class or in different class
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
