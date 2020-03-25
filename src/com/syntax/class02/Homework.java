package com.syntax.class02;

public class Homework {

	public static void main(String[] args) {

		byte a = 120;
		a = 127;

		short b = 2500;
		b = 32767;

		int c = 390000;
		c = 387000;

		long d = 100L;
		d = 150l;

		float e = 15.55f;
		e = 16.55f;

		double f = 1650.5656d;
		f = 1756.5656d;

		char initialLetter = 'M';

		boolean happy = true;

		initialLetter = 'A';
		happy = false;

		System.out.println(happy);

		happy = true;
		// happy=123 the third one we cannot print.

		System.out.println(happy);

	}

}
