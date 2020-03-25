package com.syntax.class10;

public class Task03 {

	public static void main(String[] args) {

		// Create an array of countries.
		// While retrieving all values from an array
		// print capital for each country.

		String[] countries = { "USA", "Russia", "Turkey", "Afganistan", "Colombia" };

		for (int i = 0; i < countries.length; i++) {
			
			if (countries[i].equals("USA")) {
				System.out.println("Washington DC");
				
			} else if (countries[i].equals("Russia")) {
				System.out.println("Moskow");
				{
				}
			} else if (countries[i].equals("Turkey")) {
				System.out.println("Ankara");
				{
				}
			} else if (countries[i].equals("Afganistan")) {
				System.out.println("Kabul");
				{
				}
			} else if (countries[i].equals("Colombia")) {
				System.out.println("Bogota");
				{

					System.out.println("--------2nd method----");

					for (int y = 0; y < countries.length; y++) {

					}
					if (countries[i].equals("USA")) {
						System.out.println("The capital of " + countries[i] + " is Washington DC");
					} else if (countries[i].equals("Russia")) {
						System.out.println("The capital of " + countries[i] + " is Moskow");
					} else if (countries[i].equals("Turkey")) {
						System.out.println("The capital of " + countries[i] + " is Ankara");
					} else if (countries[i].equals("Afganistan")) {
						System.out.println("The capital of " + countries[i] + " is Kabul");
					} else if (countries[i].equals("Colombia")) {
						System.out.println("The capital of " + countries[i] + " is Bogata");
					}
				}
			}
		}
	}
}
