package com.syntax.class06;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

//		 Using scanner class create calculator. 
//		 Allow user to enter 2 numbers and operator(+,-,*,/). 
//		 Based on operator provide the result to user.
//				
		Scanner scan;
		int num1;
		int num2;
		char operator;
		double result = 0;

		scan = new Scanner(System.in);

		System.out.println("Please enter the fisrt number.");
		num1 = scan.nextInt();
		System.out.println("Please enter the second number.");
		num2 = scan.nextInt();
		System.out.println("Please enter the type.");

		operator = scan.next().charAt(0);

		switch (operator) {

		case '+':
			result = num1 + num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			result = num1 / num2;
			break;

		default:
			System.out.println("Invalid number. ");
		}
		System.out.println("The result is " + num1 + operator + num2 +"="+result);

	}

}
