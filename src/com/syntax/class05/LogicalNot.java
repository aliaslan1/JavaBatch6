package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		boolean b1 = !true;
		boolean b2 = !false;

		System.out.println(b1);
		System.out.println(b2);

		boolean traffic = true;
		// if traffic-->late .else -->on time
		if (!traffic) {
			System.out.println("On time");
		} else {
			System.out.println("Late");
		}

		boolean isRain = false;

		if (!isRain) {//(!)NOT-->Reverse the condition.
			System.out.println("Take an umbrella ");
		} else {
			System.out.println("Do not take umbrelala");
		}
		// lets compare 2 numbers using NOt operator
		int num1 = 10;
		int num2 = 10;

		if (num1 == num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}

		if (!(num1 == num2)) {

			System.out.println("Numbers are not equal");
		} else {
			System.out.println("Numbers are equal");
		}

		// if name is not Marry or Anna the you are not my sister

		String name = "marry";
		String name2 = "july";
		// true OR false--->true add NOT --> false
		if (!(name.equals("marry") || name.equals("anna"))) {
			System.out.println("You are not my sister");
		} else {
			System.out.println("You are my sister ");
		}

	}

}
