package com.syntax.class06;

import java.util.Scanner;

public class Homeworkpractise4 {

	public static void main(String[] args) {
		
			// Write a program for user to enter his/hers birth month.
			// Based on the month define the season.

			// Example: if user is born in June, July or August →season =“Summer”.
			// At the end of the program we should see output as “You were born ______“.

			Scanner scan = new Scanner(System.in);		
			System.out.print("Enter the month you were born in..: ");
			String month = scan.nextLine();
			String season = null;		

			
			if (month.equals("December") || month.equals("January")|| month.equals("February")) {
				season = "Winter";
			} else if (month.equals("March") || month.equals("April")|| month.equals("May")) {
				season = "Spring";
			} else if (month.equals("June") || month.equals("July")|| month.equals("August")) {
				season = "Summer";
			} else if (month.equals("September") || month.equals("October")|| month.equals("November")) {
				season = "Fall";
			} else {
				//season="Invalid"; 
			}
			System.out.println("You were born in..:"+ season);
		}
	}
