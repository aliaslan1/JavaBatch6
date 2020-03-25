
package com.syntax.class02;

public class ModulesOperator {

	public static void main(String[] args) {

		float num1 = 12.5f;
		float num2 = 3.5f;
		float div = num1 / num2;

		System.out.println(div);

		int number1 = 13;
		int number2 = 2;

		int divOfIntegers = number1 / number2;
		System.out.println(divOfIntegers);

		double d = 12;

		System.out.println(d);
		// int i=12.5; cannot convert from double
		// modules gives remaining of the devision;

		int a = 15;

		int b = 4;

		int remainder = a % b;
		System.out.println(remainder);

		int myNumber = (8 + 9) % 2; // same as remainder
		System.out.println(myNumber);

	}

}
