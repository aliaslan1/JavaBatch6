package com.syntax.class03;

public class IfConditions {

	public static void main(String[] args) {
		int a = 90;
		int b = 300;
		// if a number i a bigger than number b
		// i want to print a is larger than b
		if (a > b) {
			System.out.println("a is larger than b");
		} else {
			System.out.println("a is smaller than b");
		}

		int expectedHours = 15;
		int actualHours = 2;
		// if expected hours are more than actual -> you will succeed
		// otherwise, please study more

		if (actualHours > expectedHours) {

			System.out.println("you will succeed");
		} else {
			System.out.println("you will study more");
		}

		double teaPrice = 4.99;
		double allowedPrice = 3.99;
		// teaPrice-2+;//2.99=4.99-2
		// if price is more than I can afford I will not buy
		// if price does matches or less i will buy it

		if (allowedPrice >= teaPrice) {
			System.out.println("I will buy a tea");
			System.out.println("And I will enjoy my tea");
		} else {

			System.out.println("I cannot afford I need to work more");
			System.out.println("I will go bak to work more");

		}
		System.out.println("I keep writing some code");
		System.out.println("I keep writing more code");

		boolean val = false;

		if (val) {// if val ==true
			System.out.println("Hello");
		} else {
			System.out.println("Bye");

			boolean isRain = false;

			// if it is raining i will take umbrella. otherwise I go for a walk

			if (isRain) {// isRain==true
				System.out.println("I will take umbralla ");
			} else {
				System.out.println("I go for a walk ");
			}

		}
		{

		}

	}

}
