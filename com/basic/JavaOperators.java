package com.basic;

/*
   Java Program for all Operators 
   
+	Addition	Adds together two values	x + y	
-	Subtraction	Subtracts one value from another	x - y	
*	Multiplication	Multiplies two values	x * y	
/	Division	Divides one value by another	x / y	
%	Modulus	Returns the division remainder	x % y	
++	Increment	Increases the value of a variable by 1	++x	
--	Decrement	Decreases the value of a variable by 1	--x

*/

public class JavaOperators {

	public static void main(String[] args) {
		
		int x=200;
		int y=10;
		
		System.out.println("Value of x::"+x);
		System.out.println("Value of x::"+y);
		
		int sum = x+y;
		
		System.out.println("Sum of x and y is::"+sum);
		
		int sub = x-y;
		
		System.out.println("Subtraction of x and y is::"+sub);
		
		int mul= x * y;
		
		System.out.println("Multipication  of x and y is::"+mul);
		
		int div = x/y;
		
		System.out.println("Division of x and y is::"+mul);
		
		int remainder= x % y;
		
		System.out.println("Remainder when you divide x by y is::"+remainder);
		
		x++;   // Post increment 
		
		 System.out.println("Post increment  of x  is::"+x);
		
	    ++x;  // Pre increment 
	    
	    System.out.println("Pre increment  of x  is::"+x);
		
		x-- ; //Post decrement 
		
		System.out.println("Post decreament  of x  is::"+x);
		
		--x ; //Pre decrement
		
		System.out.println("Pre decreament  of x  is::"+x);
		

	}

}
