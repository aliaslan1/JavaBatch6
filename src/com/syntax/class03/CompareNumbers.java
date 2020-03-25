package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {

		double numberOne = 10;
		double numberTwo = 10;

		if (numberOne > numberTwo) {

			System.out.println("Number 1 is larger than number 2");

		} else if (numberOne < numberTwo) {

			System.out.println("Number 1 is larger than number 2");

		} else {

			System.out.println("Numbers are equal");
		}
		System.out.println("------------------------------");

		// Declare variable for a day and than based on the value we will
		// output

		int day = 10;

		if (day == 1) {
			System.out.println("It is Monday. No class today");
		} else if (day == 2) {
			System.out.println("It is Tueasday . We have SDLC class");
		} else if (day == 3) {
			System.out.println("It is Wednesday. We have SDLS class");
		} else if (day == 4) {
			System.out.println("It is Thurday. We have review class");
		} else if (day == 5) {
			System.out.println("It is Friday. No class today");
		} else if (day == 6) {
			System.out.println("It is Staurday. We have Java class");
		} else if (day == 7) {
			System.out.println("It is Sunday. We have Java class");
		}else {
			System.out.println("Invalid weekday");
		}

	}

}
