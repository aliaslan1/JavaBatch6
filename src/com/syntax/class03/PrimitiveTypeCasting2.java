package com.syntax.class03;

public class PrimitiveTypeCasting2 {

	public static void main(String[] args) {

		// widening ,happens implicitly

		double d = 10;
		System.out.println(d);// 10.0

		// int 1=10.99;-->compile time error saying
		// type mismatch , cannot convert double to int

		// narrowing, explicit implementing
		int i = (int) 10.99;
		System.out.println(i);

		// byte -128 to 127
		byte b = (byte) 1285;
		System.out.println(b);

	}

}
