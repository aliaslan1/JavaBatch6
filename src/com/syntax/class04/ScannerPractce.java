package com.syntax.class04;

import java.util.Scanner;

public class ScannerPractce {

	public static void main(String[] args) {
		// ask user to enter 2 number and then compare
		// which is larger

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the first number");
		int num1 = keyboard.nextInt();

		System.out.println("Please enter second number");
		int num2 = keyboard.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + "is larger than " + num2);
		} else if (num1 == num2) {
			System.out.println(num1 + " is equal " + num2);
		} else {
			System.out.println(num1 + " is smaller than " + num2);
		}

	}

}
