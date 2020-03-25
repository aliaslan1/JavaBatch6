package com.syntax.class02;

public class LastExercise {

	public static void main(String[] args) {

		int a = 10;
		int b = 22;

		String x = "Hello";
		String y = "Bye";

		System.out.println(a + b + x + y); // 32HelloBye
		System.out.println(a + x + b + y); // 10Hello22Bye
		System.out.println(x + y + a + b); // HelloBye1022
	}

}
