package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		
		// ask as user where he or she is from
		// based on the country we will define favorite food
		// Your favorite food is _____.
		
		Scanner scan;
		String country;
		String favoriteFood;
		
		scan =new Scanner (System.in);
		System.out.println("Please enter your counrty..:");
		country =scan.nextLine();

		
		switch (country) {
		
		case "Morocco":
			favoriteFood="couscous";
			break;
		case "Belarus":
			favoriteFood="Patato";
			break;
		case "Tajikistan":
			favoriteFood="Osh";
			break;
		case "Turkey":
			favoriteFood="Baklava";
			break;
		case "Afganistan":
			favoriteFood="Mantu";
			break;
		case "Kazakhistan":
			favoriteFood="Beshparmak";
			break;
			
		default:
			favoriteFood="Unknown";

		}
		System.out.println("Your favorite food is "+favoriteFood);
	}

}
