package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		System.out.println("***********BREAK****************");

		
		for (int i=0; i<10; i++) {
			if (i==4) {
				System.out.println("I am stopping the loops");
				break;
			}
			System.out.println(i);
			
		}
		
          // continue --. it will skip current iteration.
		
		System.out.println("***********CONTINUE****************");

		for (int i=1; i<5; i++) {
			
			if (i==3 ||i==4) {
				continue;
			}
			System.out.println(i);
		}
			System.out.println("**********BREAK****************");

	//I want to print numbers from 1 to 20 except 5,6,7
	
	    for (int a=1; a<=20; a++) {
	    	if (a==5 || a==6 || a==7) {
	    		break;
	    	}
	    	System.out.println(a);
	    }

}
}


