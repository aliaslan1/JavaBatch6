package com.syntax.class04;

public class IfElseRecap {

	public static void main(String[] args) {
		/*
		 * Class schedule if it is Tuesday --> SDLC if Wednesday --> java review If
		 * Thursday --> SDLC if Saturday--> Java coding if Sunday --> my favorite Java
		 * Coding
		 */

		// first way
		// int day;
		// day=1;	

		// second way
		int day = 5;

		if (day == 2) {

			System.out.println("SDLC Class");
		} else if (day == 3) {
			System.out.println("Review Class");
		} else if (day == 4) {
			System.out.println("SDLC Class");
		} else if (day == 6) {
			System.out.println("Java Class");
		} else if (day == 7) {
			System.out.println("Review Class");
		} else {

			System.out.println("There is no class at school");
		}

	}

}
