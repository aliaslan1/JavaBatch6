package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops01 {

	public static void main(String[] args) {

		// we are playing lottery and a lucky number is 17;
		// we want to keep asking user any number from 1-20
		// until he guess the lucky number-->congrats

	
		Scanner input; 
		int number;
		int luckyNumber=17;
		input=new Scanner(System.in);
		
	do {
			System.out.println("Please enter number between 1-20 ");
			number=input.nextInt();
					
		}while (number!=luckyNumber);
	      System.out.println("Congrats! You got it....");
	}
}
