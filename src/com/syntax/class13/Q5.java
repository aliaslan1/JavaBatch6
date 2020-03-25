package com.syntax.class13;

public class Q5 {

	public static void main(String[] args) {

		/*
		 * TWrite a java program to reverse String? Reverse a string Character by
		 * Character? Reverse a string word by word?
		 */

		String given = "I love java";
		String reversed = "";

		for (int i = given.length() - 1; i >= 0; i--)
			
		{
			reversed = reversed + given.charAt(i);

		}
		System.out.println("Reversed String =" + reversed);
		
		String [] array=given.split(" ");
		String reversedWords="";
		
		for (int i=array.length-1; i>=0;i--) {
			
			reversedWords=reversedWords+array[i]+" ";

		}
		
		System.out.println("Reversed String =" + reversedWords);


	}
}
