package com.library;

public class StringLibrary {

	public static void main(String[] args) {

		String str = "omsamayshoury";
		
		int len = str.length();

		System.out.println(len);

		String strappend = str.concat("prisha");

		System.out.println(strappend);

		String subString = str.substring(6);

		System.out.println(subString);

		boolean b = str.startsWith("s");

		System.out.println(b);
		
		boolean b1 = str.endsWith("shoury");
		
		System.out.println(b1);
		
		boolean c1 =str.equalsIgnoreCase("OmSamayshoury");
			
		System.out.println(c1);

	}

}
