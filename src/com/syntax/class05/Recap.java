package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

	//Scanner class -to take an input from a user
		
		Scanner anyVariableName=new Scanner(System.in);
		
		System.out.println("Please enter spring value");
		String val=anyVariableName.nextLine();//take entire line
				
				
		System.out.println("Please enter boolean value");
		boolean val1=anyVariableName.nextBoolean();
		
		System.out.println("Please enter spring value");
		String val2=anyVariableName.next();//take first word until space
		
		System.out.println("Please enter integer value");
		int val3=anyVariableName.nextInt();
		
		System.out.println("Please enter double value");
		double val4=anyVariableName.nextDouble();
			
		
				
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
			
		
	}

}
