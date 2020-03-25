package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {

		boolean flag = true;
		boolean classToday = false;

		if (flag) {
			System.out.println("Hello");

			if (classToday) {
				System.out.println("Hello my friend");
			}
		} else {
			System.out.println("Bye");
		}
		System.out.println("I am outside of the if condition");

	}

}
