package com.syntax.class04;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		// Task1

		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less than 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the amount of loan");
		int loan = scan.nextInt();

		if (loan < 20000) {
			System.out.println("You will be getting your loan");
		} else {
			System.out.println("it will be rejected");
		}

		System.out.println("***********************************");

	}

}
