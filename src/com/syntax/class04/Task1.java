package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * if user has a diploma,You should say congratulations, otherwise program
		 * should suggests to get a degree. Then if user has a degree program should
		 * check a gpa score If gpa score is higher or equals to 3.5--> output should
		 * say "You are eligible for the scholar ship" otherwise-->"You should have
		 * studied harder.
		 */

		boolean diploma = true;
		double gpa = 3.5;

		if (diploma) {
			System.out.println("Congratulations! You got your diploma");
		} else if (gpa > 3.5) {
			System.out.println("The progme is suggestion you to get a degree");
		}

		if (gpa > 3.5) {
			System.out.println("You are eligible for scholarship");
		} else {
			System.out.println("You shoud have studied harder");
		}

	}

}
