package com.syntax.class06;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Allow user to enter grade and then provide explanation:
		// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		// At the end your program should print which grade was entered by a user with
		// explanation.

		Scanner scan;
		char average =0;
		String text;

		scan = new Scanner(System.in);
		System.out.println("Please enter your grade ?");
		average = scan.next().charAt(0);
		

		switch (average) {

		case 'A':
			text = "Excellent !";
			break;
		case 'B':
			text = "Good !";
			break;
		case 'C':
			text = "Average !";
			break;
		case 'D':
			text = "Bad !";
			break;			
			
		default:
			text = "not acceptable !";

		}
		

		System.out.println("Your other grade is "+text);

	}

}
