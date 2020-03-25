package com.syntax.class04;

public class Recap {

	public static void main(String[] args) {

		int num = 23;
		num = 90;
		num -= 200;// -110=90-200
		num -= 110;
		num += 220;

		if (num > 0) {
			System.out.println(num + " is positie number");
		} else if (num == 0) {
			System.out.println("Value of num is " + num);
		} else {
			System.out.println(num + " is negative number");
		}

		// even or odd (7,8)

		int i = 134;

		if (i % 2 == 0) {
			System.out.println(i + " is an even number");
		} else {
			System.out.println(i + " is an odd number");
		}
		System.out.println("========================================");

		// 2
		int y = 137;

		if (y % 2 != 0) {
			System.out.println(y + " is an odd number");
		} else {
			System.out.println(y + " is an even number");
		}

		int integer = 8;
	}

}
