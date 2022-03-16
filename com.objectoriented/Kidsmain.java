package com.objectoriented;

public class Kidsmain {

	public static void main(String[] args) {

		Kids s = new Kids();

		s.kidname = "Aarna";
		s.age = 6;
		s.friends = "Nishi and Jahnav";
		s.oldersiblings = "Prisha";
		s.schoolname = "Monta Jane Akin Elementary";

		Kids s1 = new Kids();

		s1.kidname = "Jahnav";
		s1.age = 6;
		s1.friends = "Aarna and Jahnav";
		s1.oldersiblings = "Prisha";
		s1.schoolname = "Monta Jane Akin Elementary";

		Kids s2 = new Kids();

		s2.kidname = "Nishi";
		s2.age = 5;
		s2.friends = "Aarna and Jahnav";
		s2.oldersiblings = "Aayushi";
		s2.schoolname = "Founders Academy";

		System.out.println(s.kidname);
		System.out.println(s.age);
		System.out.println(s.friends);
		System.out.println(s.oldersiblings);
		System.out.println(s.schoolname);

		System.out.println(s1.kidname);
		System.out.println(s1.age);
		System.out.println(s1.friends);
		System.out.println(s1.oldersiblings);
		System.out.println(s1.schoolname);

		System.out.println(s2.kidname);
		System.out.println(s2.age);
		System.out.println(s2.friends);
		System.out.println(s2.oldersiblings);
		System.out.println(s2.schoolname);

	}

}
