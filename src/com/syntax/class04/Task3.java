package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("You need to be 18 years old to get the driver licence");
		int age = scan.nextInt();

		if (age < 19) {
			System.out.println("it will be rejected");
		} else {
			System.out.println("You will be getting your licence");
		}
	}

}
