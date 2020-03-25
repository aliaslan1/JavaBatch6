package com.syntax.class07;

public class DoWhile01 {

	public static void main(String[] args) {
	
		// Print even numbers from 20 to 50 using do while
		// one way

		int n = 20;
		do {
			System.out.println(n);
			n += 2;
		} while (n <= 50);
		
		System.out.println("################");
		
		// second way
		int n1 = 20;
		do {
			if (n1 % 2 == 0) {
				System.out.println(n1);
			}
			n++;
		} while (n <= 50);

	}

}
