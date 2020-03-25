package com.syntax.class03;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 10000;
		int num2 = 1000;

		if (num1 > num2) {
			System.out.println("Num1 is larger tha num2");

		} else if (num1 == num2) {
			System.out.println("Num1 is equal to num2");

		} else {
			System.out.println("Num1 is smaller than num2");
		}

		int day = 0;

		if (day == 1) {
			System.out.println("Today is Monday. I need to go work");
		} else if (day == 2) {
			System.out.println("Today is Tueasday I have SDLC class");
		} else if (day == 3) {
			System.out.println("Today is wednesday I have Java class");
		} else if (day == 4) {
			System.out.println("Today is Thursday I have SDLC review class");
		} else if (day == 5) {
			System.out.println("Today if Friday. Weekennd is here");
		} else if (day == 6) {
			System.out.println("Today is Saturday . I have class from 9 to 3pm");
		} else if (day == 7) {
			System.out.println("I want to rest on Sunday");
		} else {
			System.out.println("Which day is it?");
			{
				// ctrl+shift+f---> for windows //command+shift+f---> for Mac
			}
		}
	}
}
