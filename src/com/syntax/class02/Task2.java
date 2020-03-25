package com.syntax.class02;

public class Task2 {

	public static void main(String[] args) {

		// 1-Write a Java program to add, subtract, multiply and divide 2 decimal
		// values. Your program should say. “The _______ of 2 numbers ___ and ___ is
		// equal to _____”
		// 2-Write a program to find the square of the number 3.9. You program should
		// say “The square of the ____ is ____ ”
		// 3-Write a program to print the area and perimeter of a rectangle with width =
		// 5 and height = 8. Your program should say. “The perimeter of a rectangle with
		// width ___ and height ____ is equal to _____ and the area is __”

		// 1
		double num1 = 10.2;
		double num2 = 3.5;
		double sum1 = num1 + num2;
		double sum2 = num1 - num2;
		double sum3 = num1 * num2;
		double sum4 = num1 / num2;
		System.out.println("The adding of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum1);
		// 2
		double s = 3.9;
		double s2 = s * s;
		System.out.println("The squire of the " + s + " is " + s2);

		// 3
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimiter = 2 * (width + height);
		System.out.println("The perimeter of a rectangle with width " + width + "and height " + height + " is egual to "
				+ perimiter + " and the area is " + area);

	}

}
