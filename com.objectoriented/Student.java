package com.objectoriented;

public class Student {

	/* All properties of Student class */
	int id;
	String name;
	String address;
	String teacherName;

	// append is Method or function str and str1 are arguments of append function
	// This Method returns String type
	public String append(String str, String str1) {

		return str + " " + str1;
	}

	// countChar is Method or function str is arguments of append function
	// This Method returns int type
	public int countChar(String str) {

		return str.length();
	}

	// countChar is Method or function. This function has no arguments
	// This Method returns void means no return
	public void print() {

		System.out.println(id + " " + name + "  " + "  " + address + " " + teacherName);
	}
}
