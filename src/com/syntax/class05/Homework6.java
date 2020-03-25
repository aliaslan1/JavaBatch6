package com.syntax.class05;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {

		// Program to find largest number among three numbers using
		// nested if provided by a user (numbers must be distinct)

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number..:");
		int num1 = scan.nextInt();

		System.out.println("Please enter second number..:");
		int num2 = scan.nextInt();

		System.out.println("Please enter third number..:");
		int num3 = scan.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is the largest number.");
			} else {
				System.out.println(num3 + " is the largest number.");
			}
		} else if (num2 > num3) {
			System.out.println(num2 + " is the largest number.");

		} else
			System.out.println(num3 + " is the largest number.");

	}
}