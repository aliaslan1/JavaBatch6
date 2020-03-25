package com.syntax.class08;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*
		 * lets ask user to enter if it raining or not(true or false) as long as there
		 * is a rain Lets keep asking as soon as there is no rain--you can go to park
		 */

		Scanner scan;
		boolean isRain;
		scan = new Scanner(System.in);

		do {
			System.out.println("Is it rainnig?");
			isRain = scan.nextBoolean();

		} while (!isRain);
		System.out.println("Go to the park");

	}

}
