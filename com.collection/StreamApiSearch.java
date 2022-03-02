package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiSearch {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		List<String> filterLIst = new ArrayList<String>();
		
		// class 

		list.add("asamay");
		list.add("avikhyat");
		list.add("ashorya");
		list.add("tatva");
		list.add("james");

		/*
		 * for (Integer p : list) { System.out.println(p); }
		 */
		
		
		/*  Print Array List with Stream  */
		
		System.out.println("Print Array List with Stream");
		list.stream().forEach(i -> System.out.println(i) );
		
		/*  Print Array List with data start with a  */
		
		System.out.println("Print Array List with data start with a  ");
		list.stream().filter(x -> x.startsWith("a")).forEach(x-> System.out.println(x));
		
		/*  Print Array List with data start with a  and return new ArrayList and store in  filterLIst */
		
		System.out.println("Print Array List with data start with a  and return new ArrayList and store in  filterLIst  ");
		filterLIst  =  list.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
		
		
		/*  Print new filter filterLIst  with Stream  */
		System.out.println("Print new filter filterLIst  with Stream ");
		filterLIst.stream().forEach(i -> System.out.println(i) );
		
	}

}
