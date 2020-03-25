package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Task1
		//		Prompt the user to enter person heights in inches. Person should be classified as one of the following:
        //		short (under 60 inch)
        //		medium(between 60 -72 inch)
        //		tall (over 72 inch)
		
		Scanner Java = new Scanner(System.in);
		System.out.println("Please enter your height in Inches");
		int height;
		height = Java.nextInt();
		if (height < 60) {
			System.out.println(" you are short");
		} else if (height >= 60 && height <= 72) {
			System.out.println(" you are medium");
		} else {
			System.out.println(" you are tall");
		}

		System.out.println("----------------------------");
		
		//Task 2

		System.out.println(" Please enter day");
		Scanner Java1 = new Scanner(System.in);
		int day = Java1.nextInt();
		if (day >= 1 && day <= 5) {
			System.out.println("Weekday");
		} else if (day > 5 && day <= 7) {
			System.out.println("weekedn");
		} else {
			System.out.println("invalid day");
		}

	}
}
