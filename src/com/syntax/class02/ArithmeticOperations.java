package com.syntax.class02;

public class ArithmeticOperations {

	/*
	 * declare 2 variables and initialize them perform
	 * addition,subtraction,multiplication and division
	 */

	public static void main(String[] args) {

		int num1, num2;

		num1 = 20;
		num2 = 25;

		System.out.println(num1 + num2); // 45
		System.out.println(num1 - num2); // 5
		System.out.println(num1 * num2); // 500
		System.out.println(num1 / num2); // 0.8

		// how can we print value of num1 and num2 together

		System.out.println(num1 + "," + num2);

		int sum = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;

		// The result of the summarization is 45
		// The result of the subtraction is -5
		// The result of the multiplication is 500
		// The result of the division is 0.8

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);

		System.out.println("The addition of 2 numbers " + sum);
		System.out.println("The subtraction of 2 numbers " + sub);
		System.out.println("The multiplication of 2 numbers " + mult);
		System.out.println("The division of 2 numbers " + div);
	}
}
