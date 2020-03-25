package com.syntax.class03;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and declare int variable that will hold a month. Based
		 * on the value of the variable your program should print the name of the month.
		 * 
		 * // Write a program to check whether number is positive or negative.
		 * 
		 * 
		 * /* Interview Question Write a Java Program to check whether number is Even or
		 * Odd.
		 */
		
		//Task1

		int month = 10;

		if (month == 1) {
			System.out.println("It is January");
		} else if (month == 2) {
			System.out.println("It is February");
		} else if (month == 3) {
			System.out.println("It is March");
		} else if (month == 4) {
			System.out.println("It is April");
		} else if (month == 5) {
			System.out.println("It is May");
		} else if (month == 6) {
			System.out.println("It is June");
		} else if (month == 7) {
			System.out.println("It is July");
		} else if (month == 8) {
			System.out.println("It is August");
		} else if (month == 9) {
			System.out.println("It is September");
		} else if (month == 10) {
			System.out.println("It is October");
		} else if (month == 11) {
			System.out.println("It is November");
		} else if (month == 12) {
			System.out.println("It is December");
		} else {
			System.out.println("There is no valid month");
		}
		System.out.println("-------------------------");
		
		//Task2

		int number = 109;
		if (number > 0) {
			System.out.println(number + " is a positive number");
		} else if (number < 0) {
			System.out.println(number + " is a negative number");
		} else {
			System.out.println(number + " is neither positive nor negative");

			System.out.println("-------------------------");
			
			//Task3

			int num = 3;

			if (num % 2 == 0) {
				System.out.println("The number is even");
			} else {
				System.out.println("The number is odd");
			}
		}
	}
}