package com.objectoriented;

public class Main {

	public static void main(String[] args) {

		Student s = new Student();
		// Create Object of Student Class. New will allocate memory
		// s is Object of student
		
		s.studentId = 1;
		s.studentName = "Ansh";
		s.address = "2217 test lane";
		s.emContact = 9999999;
		s.teacherName = "Ketrina Caffe";
		s.password = "749321";

		Student s1 = new Student(); // Create second  Object of Student Class. New will allocate memory
		                              // s1  is Object of Student
		s1.studentId = 2;
		s1.studentName = "Ayushi";
		s1.address = "dsdsd test lane";
		s1.emContact = 8888888;
		s1.teacherName = "James Bond";
		s1.password = "88888";

		
		System.out.println(s.studentId);
		System.out.println(s.studentName);
		System.out.println(s.address);
		System.out.println(s.emContact);
		System.out.println(s.teacherName);
		System.out.println(s.password);
		
		
		System.out.println(s1.studentId);
		System.out.println(s1.studentName);
		System.out.println(s1.address);
		System.out.println(s1.emContact);
		System.out.println(s1.teacherName);
		System.out.println(s1.password);
		

	}

}
