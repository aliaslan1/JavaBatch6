package com.syntax.class06;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it.
		// Once values are captured print which language user speaks.

		Scanner input;
		String language;

		input = new Scanner(System.in);

		System.out.println("What is your country ?");

		language = input.nextLine();

		switch (language) {

		case "USA":
			language = "English";
			break;
		case "Canada":
			language = "English";
			break;
		case "France":
			language = "French";
			break;
		case "Turkey":
			language = "Turkish";
			break;
		default:
			language = "Invalid";

		}
		System.out.println("You speak " + language);

	}

}
