package com.syntax.class08;

public class Task07 {

	public static void main(String[] args) {
		/*
		 * write a code to find the sum of even & odd Numbers from range 1 to 20
		 * expecting 2 outputs sum for odd numbers=... sum for even numbers=...
		 */
		
//		Task1
//		Write a program that reads a range of integers 
//		(start and end point),provided by a user and then 
//		from that range prints the sum of the even and odd integers.
	

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 30; i++) {

			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + 1;
			}

		}
		System.out.println("The total of all even#=" + sumEven);
		System.out.println("The total of all odd#=" + sumOdd);

		
//		Task 2
		
//		Write a program to ask a user to enter item they want to buy and the price of that 
//		item.Every time user enters money accumulate the amount and tell the user how much 
//		is left to pay off the amount. If user give more money program should return a change. 
//		Whenever a user done with payments program should say “Thank you for shopping!”
		
		
		

		
	}

}
