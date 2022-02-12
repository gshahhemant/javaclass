package com.collection;

import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {
		
		// int , long float double are primitive data types

		ArrayList<String> lst = new ArrayList<String>(); // allocate the memory

		// ArrayList is class created by java
		// here we have object not variable

		lst.add("hemant");
		lst.add("Shaurya");
		lst.add("Vikhyat");
		lst.add("tatva");
		
		lst.add("hemant1");
		lst.add("Shaurya2");
		lst.add("Vikhyat4");
		lst.add("tatva");
		
		//lst.remove("tatva");
		
	//	lst.clear();

		for (String p : lst) {
			System.out.println(p);
		}

			
		ArrayList<Integer> lstInt = new ArrayList<Integer>(); // allocate the memory

		// ArrayList is class created by java
		// here we have object not variable

		lstInt.add(1);
		lstInt.add(2);
		lstInt.add(3);
		lstInt.add(4);

		for (Integer p1: lstInt) {
			System.out.println(p1);
		}

		
		
	}

}
