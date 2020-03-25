package com.syntax.class03;

public class IfCondition2 {

	public static void main(String[] args) {

		// Declare a number and compare if number is larger than 100
		// if number is larger than 100--> my number is large.

		System.out.println("Starting coding");

		int num = 178;

		if (num > 1000) {

			System.out.println("My number is large");

		}

		System.out.println("End of the program");

		System.out.println("-----------------------------------------------");

		int expectedHours = 15;
		int actualHours = 4;

		// if actual is more than is expected --> you will love java

		if (actualHours >= expectedHours) {

			System.out.println("You will love Java");

		} else {// Otherwise=else (if false )--> go inside else block
			System.out.println("You will not like Java");
		}
		System.out.println("-----------------------------------------------");

		double budget = 10000;
		double carPrice = 12000;
		// using if we are doing verification and selective execution

		if (budget > carPrice) {
			System.out.println("I will buy this car today");
			System.out.println("I will be happy");
		} else {
			System.out.println("I will not buy this car today," + " I will go learn Java");
			System.out.println("I will be motivated");
		}

		System.out.println("I am code after if condition");

	}

}
