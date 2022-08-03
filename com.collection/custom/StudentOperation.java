package com.collection.custom;

import java.util.ArrayList;

public class StudentOperation {

	public static void main(String[] args) {

		Student s = new Student(1, "samay", "abc");

		Student s1 = new Student(2, "Tatva", "bcd");

		Student s3 = new Student(3, "Vikhyat", "ssss");

		Student s4 = new Student(4, "Shouray", "ssss");

		Student s5 = new Student(5, "ttt", "ssss");

		ArrayList<Student> lst = new ArrayList<Student>();

		lst.add(s);
		lst.add(s1);
		lst.add(s3);
		lst.add(s4);
		lst.add(s5);

		System.out.println("****** Prinlt All Students Details ******");

		lst.stream().forEach(x -> System.out.println(x.id + " " + x.name + " " + x.teacher));

		System.out.println("****** Prinlt  Students name whose name start with T ot t ******");

		lst.stream().filter(x -> x.name.startsWith("t") || x.name.startsWith("T"))
				.forEach(x -> System.out.println(x.id + " " + x.name + " " + x.teacher));

		System.out.println("****** Prinlt All Students name whose name is samay******");

		lst.stream().filter(x -> x.name.equals("samay"))
				.forEach(x -> System.out.println(x.id + " " + x.name + " " + x.teacher));

		System.out.println("****** Prinlt All Students Id whose name is samay******");

		lst.stream().filter(x -> x.name.equals("samay")).forEach(x -> System.out.println(x.id));

		System.out.println("****** Prinlt All Students name  whose teacher  is ssss******");

		lst.stream().filter(x -> x.teacher.equals("ssss"))
				.forEach(x -> System.out.println(x.id + " " + x.name + " " + x.teacher));

		System.out.println("****** Prinlt  Students name whose name start with T and id is 5 ******");

		lst.stream().filter(x -> x.name.startsWith("T") || x.id.equals(3))
				.forEach(x -> System.out.println(x.id + " " + x.name + " " + x.teacher));

	}

}
