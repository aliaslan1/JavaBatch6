package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter any number");

		/*
		 * nextInt();-> for numbers 
		 * nextLine();->String 
		 * nextDouble():->double
		 */

		int number = scan1.nextInt();
		System.out.println("Entered number is " + number);

		System.out.println("---------------------");

		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name = input1.nextLine();
		System.out.println("Good afternoon " + name);

	}
}
