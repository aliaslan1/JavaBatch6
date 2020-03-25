package com.syntax.class09;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("------------------");

		for (int i = 1; i <= 5; i++) {
			// System.out.print("row");
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 5; i >= 0; i--) {
			// System.out.print("row");
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("------------------02----------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("enter start point");
		int a = scan.nextInt();

		System.out.println("enter end point");
		int b = scan.nextInt();
		int evenTotal = 0;
		int oddTotal = 0;

		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				evenTotal = evenTotal + i;
			} else {
				oddTotal = oddTotal + i;
			}

		}
		System.out.println("even total is " + evenTotal);
		System.out.println("even total is " + oddTotal);

	}

}
