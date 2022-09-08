package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	// Class variable
	HashMap<String, Integer> phoneMap = new HashMap<String, Integer>();

	// Constructor name is same as class name
	public MapClass() {
		
		System.out.println("****************** List *********************");

		phoneMap.put("vikhyat", 123456789);
		phoneMap.put("shaurya", 234567890);
		phoneMap.put("hemant", 45678999);
		phoneMap.put("om", 999999999);
		phoneMap.put("samay", 543543455);
		
		System.out.println("****************** END *********************");
	}

	// function or method
	public void printMap() {

		for (Map.Entry<String, Integer> e : phoneMap.entrySet()) {

			System.out.println(e.getKey() + ":" + e.getValue());
		}

	}

	// function or method
	public void getPhone(String name) {

		int phone = phoneMap.get(name);

		System.out.println(phone);

	}

}
