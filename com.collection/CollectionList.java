package com.collection;

import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {

		// int , long float double are primitive data types

		ArrayList<String> lst = new ArrayList<String>(); // Creating object of ArrayList . New allocate the memory
															// lst is object name

		// ArrayList is class created by java
		// here we have object not variable

		lst.add("OM");
		lst.add("Ansh");
		lst.add("Aayushi");
		lst.add("Samay");
		lst.add("Samay");
		lst.add("Samay");
		lst.add("Samay");

		// lst.remove(0);
		// lst.removeAll(lst); same as clear

		// lst.clear(); clear all list elements

		for (String p : lst) {

			System.out.println(p);
		}

		
		
		ArrayList<Integer> lstInt = new ArrayList<Integer>(); 
		// int will not work we need to write Integer because ArrayList need Class. 
		//Integer is class and int is primitive data types.
		

		lstInt.add(1);
		lstInt.add(2);
		lstInt.add(3);
		lstInt.add(4);

		for (Integer intdata : lstInt) {
			
			System.out.println(intdata);
		}
		
		
		
		

	}

}
