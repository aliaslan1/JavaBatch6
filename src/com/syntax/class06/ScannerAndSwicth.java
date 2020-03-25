package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwicth {

	public static void main(String[] args) {
		// ask user a gender: M or F
		// based on the gender will provide description

		Scanner scan;
		char gender;
		String genderType;

		scan = new Scanner(System.in);

		System.out.println("Please enter gender: M or F");
		
		gender = scan.next().charAt(0);

		switch (gender) {

		case 'M':
			genderType = "Male";
			break;
		case 'F':
			genderType = "Female ";
			break;
		default:
			genderType = "Unfamilier ";

		}
		System.out.println("The gender is " + genderType);
	}

}
