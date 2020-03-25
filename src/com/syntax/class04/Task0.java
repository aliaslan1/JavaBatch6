package com.syntax.class04;

public class Task0 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * Program should check if rate is higher than 4.5 user will not buy a house,
		 * Otherwise use will consider buying. Once user decides to buy a house, of
		 * price of the house is larger than 200000 than user will take a loan,
		 * Otherwise user will pay cash
		 */

		double rate = 4.5;
		int price = 200000;
		if (rate < 4.5) {

			System.out.println("You will consider buying a house ");
		} else {
			System.out.println("You cannot buy this house ");

			if (price > 300000) {
				System.out.println("The client can take the loan");
			} else {
				System.out.println("The client will pay the cash");
			}

		}
	}

}
