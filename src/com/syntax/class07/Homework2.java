package com.syntax.class07;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/* You need to ask user to pay for coffee
		 * You need to keep asking user to pay for it until
		 * entered price is equal +5;
		 * after user paID THEN SAY "Enjoy your coffee!"
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int cost=5;
		
		do {
			System.out.println("Pay the coffe price");
			cost=scan.nextInt();
			
			
		}while (cost!=5);
		System.out.println("Enyoy your coffee");
		
		
		// 2 way with while 
		int price1;
		System.out.println("Please pay for your coffee");
			price1=scan.nextInt();//4
			
			while (price1!=5) {
				
				System.out.println("Please pay your coffee");
				price1=scan.nextInt();
				
			}
		System.out.println("Enjoy your coffee");
		
	}

}
