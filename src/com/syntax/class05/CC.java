package com.syntax.class05;

import java.util.Scanner;

public class CC {

	public static void main(String[] args) {

		/*
		 *  them to pay off otherwise you can tell them that can spend more
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a crediy card? true or false");
		boolean cc = input.nextBoolean();

		if (cc) {

			System.out.println("What is the balance on your card");
			int balance = input.nextInt();

			if (balance > 1000) {
				System.out.println("Please pay off your balance");
			} else {

				System.out.println("You can spend More money");
			}
		} else {

			System.out.println("Would like to apply for credit card");
		}

	}
}
