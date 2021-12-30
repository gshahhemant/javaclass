package com.loop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Enter table # ::");
		int  num = in.nextInt();
				
		for (int i=1 ; i <=10 ; i++) {
			
			 System.out.println(num+"*"+i+"=="+num * i);
		}
		
	}

}
