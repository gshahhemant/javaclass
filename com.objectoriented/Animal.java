package com.objectoriented;

public class Animal {

	/* Properties of Animal class , Class level variables */
	String name;
	String food;
	int lifeSpan;
	float weight;
	boolean vertebrate;
	
	

	// Constructor with 5 Arguments
	public Animal(String name, String food, int lifeSpan, float weight, boolean vertebrate) {

		this.name = name;
		this.food = food;
		this.lifeSpan = lifeSpan;
		this.weight = weight;
		this.vertebrate = vertebrate;
	}

	// print is function/method with no arguments and with void return
	public void  print() {

		System.out.println("******** Print Animal*************");

		System.out.println("name =>" + name);
		System.out.println("food =>" + food);
		System.out.println("lifeSpan =>" + lifeSpan);
		System.out.println("weight =>" + weight);
		System.out.println("vertebrate =>" + vertebrate);
		
	}
	

	public static void main(String args[]) {

		// lion is Object of which class Animal class
		Animal lion = new Animal("lion", "deer", 40, 200, true);

		lion.print();
	

		// dog is Object of which class Animal class
		Animal dog = new Animal("Dog", "biscuits", 13, 80, true);

		dog.print();
		

	}

}
