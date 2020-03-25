package com.syntax.class08;

public class BreakStatementLoops {

	public static void main(String[] args) {
		// The break statement in Java programming language has the following two usages −

		/*  When the break statement is encountered inside a loop, 
		 *  the loop is immediately terminated and the program control resumes 
		 *	at the next statement following the loop.
		 */

		/*  It can be used to terminate a case in the 
		 *  switch statement (covered in the next chapter).
		 */

		int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         if( x == 30 ) {
	            break;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
	   }
	}
