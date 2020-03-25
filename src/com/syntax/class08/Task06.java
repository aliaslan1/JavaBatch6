package com.syntax.class08;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		// Print numbers from 1 to 50 except those that are divisible by 3

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);

		}

		System.out.println("+++++++++++++++++++++++");

		// Create a program that will be asking user to apply for a credit card 10
		// times.
		// As soon you get an “yes” from a user program should stop asking.

		String card;
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 50; i++) {
			System.out.println("Are you apply to a credit card?");
			card = scan.nextLine();

			if (i == 10) {

				break;
			}
		}
	}

}
