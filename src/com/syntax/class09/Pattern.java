package com.syntax.class09;

public class Pattern {

	public static void main(String[] args) {

		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <=5; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------01----------------------");

		for (int i = 0; i < 5; i++) { // row -->
			for (int y = 0; y < 7; y++) { // columns|down
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-------------------02---------------------");

		for (int i = 0; i < 10; i++) { // row
			for (int y = 0; y < 10; y++) { // columns
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("---------------------03-------------------");
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
		System.out.println("-----------------------04-----------------");

		/*
		 * 11111 22222 33333 44444 55555
		 */
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(1 + " ");
			}
			System.out.println();

		}
		System.out.println("-------------------05---------------------");

		/*
		 * 123456789 123456789 123456789 123456789 123456789
		 */
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		System.out.println("---------------------06-------------------");
		/*
		 * 54321 54321 54321 54321 54321
		 */
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("--------------------07--------------------");
		/*
		 * 55555 44444 33333 22222 11111
		 */
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("--------------------08--------------------");
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------09-------------------");
		/*
		 * 1 22 333 4444 55555 666666 7777777 88888888 999999999
		 */

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("--------------------10--------------------");

	}
}
