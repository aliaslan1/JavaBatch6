package com.syntax.class03;

public class Tasks1 {

	public static void main(String[] args) {

		/*
		 * Declare variable cakePiece=11 and divide cakePiece between 4 people using
		 * shorthand operator
		 */

		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);

		double cake = 11;
		cake /= 4;
		System.out.println(cake);

		/*
		 * Declare variable cakePiece=25 and divide cakePiece between 7 people. Using
		 * shorthand operator found out how many pieces of cake left after it was
		 * distributed equally among 7people
		 */

		int cakePiece2 = 25;
		cakePiece2 %= 7;
		System.out.println(cakePiece2);

	}

}
