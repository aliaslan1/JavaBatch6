package com.syntax.class05;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// Write a program to find largest of three double values
		// using if-else..if and logical operators provided by a user
		// (numbers must be distinct)

		Scanner scan = new Scanner(System.in);
		double number = 0;

		System.out.println("Please enter your first number..:");
		double num1 = scan.nextDouble();

		System.out.println("Please enter your second number..:");
		double num2 = scan.nextDouble();

		System.out.println("Please enter your third number..:");
		double num3 = scan.nextDouble();

		if (num1 > num2 && num1 > num3) {
			number = num1;

		} else if (num2 > num1 && num2 > num3) {
			number = num2;

		} else if (num3 > num1 && num3 > num2) {
			number = num3;

		}
		System.out.println("The largest number is..:" + number);
	}
}
