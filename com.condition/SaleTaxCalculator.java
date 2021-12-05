package com.condition;

/*
 * Program to calculate sale tax based on item price
 * if Item Price is <= 10000 than sale tax is 10%
 * if Item Price is >10000 and <=40000 than  sale tax is 20%
 * if Item Price is >40000 and <=70000  than sale tax is 30%
 * if Item Price > 70000 than tax is 40%
 */
public class SaleTaxCalculator {

	public static void main(String[] args) {

		double itemPrice = 10000;
		double saleTax = 0;
		double totalPayoff = 0;

		if (itemPrice <= 10000) {

			saleTax = itemPrice * 0.10;
		}

		if (itemPrice > 10000 && itemPrice <= 40000) {

			saleTax = itemPrice * 0.20;
		}

		if (itemPrice > 40000 && itemPrice <= 70000) {

			saleTax = itemPrice * 0.30;
		}

		if (itemPrice > 70000) {

			saleTax = itemPrice * 0.40;
		}

		totalPayoff = itemPrice + saleTax;

		System.out.println("Sale tax is::" + saleTax);
		System.out.println("Total you have to pay ::" + totalPayoff);

	}

}
