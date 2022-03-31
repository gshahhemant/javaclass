package com.objectoriented;

public class TestStudent {

	public static void main(String args[]) {

		Student s = new Student(); // S is object is student class. New is used to allocate memory for student
									// class

		s.id = 100;
		s.name = "samay";
		s.address = "tesmp address";
		s.teacherName = "lusero";

		s.print();

		Student sa = new Student();

		sa.id = 200;
		sa.name = "vikhyat";
		sa.address = "hazzlewood";
		sa.teacherName = "shun";

		System.out.println("\n");

		sa.print();

		String str = s.append("samay", "vikhyat");

		System.out.println(str);

		System.out.println(s.countChar(str));

	}

}
