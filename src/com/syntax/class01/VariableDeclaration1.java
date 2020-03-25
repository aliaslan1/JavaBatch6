package com.syntax.class01;

public class VariableDeclaration1 {

	public static void main(String[] args) {

		// Create a variable and store value.
		// 1st way:
		// Declaring variable and storing (or assigning) the value.

		boolean b1 = true;

		// 2 way;
		// 1st step--> Declare the type and Variable ,
		// 2nd step --> Create a variable and Assign the Value.

		int i;
		i = 1000;

		// Declare multiple variables and assign values later.

		char x, y, z;
		x = 'A';
		y = '^';
		z = '0';

		// we cannot add variables with the same name in 1 program.
		// double i=12.99;--> java will complain b/se of that we cannot use the same
		// variables.

		double d = 12.99;

		z = '#';// Reassigning the value. Top to the bottom.
		i = 2000;

		System.out.println(i);

		int num = 100;
		int num1 = 100;

		System.out.println(z);
		System.out.println(num);
		System.out.println(d);
		System.out.println(x);
		System.out.println(y);
		System.out.println(num1);
		System.out.println(b1);

	}

}
