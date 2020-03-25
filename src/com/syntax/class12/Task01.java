package com.syntax.class12;

public class Task01 {

	// 1.Create a String and print it in reverse order (Sunday → yadnuS).

	public static void main(String[] args) {

		// task 1
		String str = "Sunday";
		char reverse;
		for (int i = str.length() - 1; i > -1; i--) {
			reverse = str.charAt(i);
			System.out.print(reverse);
		}
	}
}