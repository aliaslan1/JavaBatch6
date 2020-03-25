package com.syntax.class08;

public class FoorLoop {

	public static void main(String[] args) {
		// Say good morning 5 times
		// initialize test condition increment
		for (int i = 0; i <= 4; i++) {
			System.out.println("Good morning");

		}
		System.out.println("-------------------01------------");

		// print numbers from 1-10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------02------------");

		// print numbers from 10-1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("-------------------03------------");

		// print numbers from 10-1
		for (int i = 10; i >= 15; i--) {// we can't print this
			System.out.println(i);
		}
		System.out.println("-------------------04------------");

		// print numbers from 1 to 100 in 1 line
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("-------------------05------------");

		// print numbers from 100 to 1
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}

	}
}
