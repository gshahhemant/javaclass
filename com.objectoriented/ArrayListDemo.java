package com.objectoriented;

import java.util.ArrayList;

public class ArrayListDemo {

	// ArrayList is data structure that stores data.
	ArrayList<String> names = new ArrayList<String>();

//  ArrayListDemo() is constructor with no arguments
	public ArrayListDemo() {

		names.add("Shaurya");
		names.add("OM");
		names.add("Ansh");
		names.add("Tatva");
		names.add("Aayushi");
		names.add("Prisa");
		names.add("Samay");

	}

	// printArrayList Method name
	public void printArrayList() {

		for (String str : names) {

			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		/*
		 * demo Object is created of ArrayListDemo class. ArrayListDemo will call the
		 * constructor ArrayListDemo with no arguments
		 */
		ArrayListDemo demo = new ArrayListDemo();

		demo.printArrayList();

	}

}
