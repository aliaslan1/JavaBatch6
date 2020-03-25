package com.syntax.class01;

public class EscapeSequences {

	public static void main(String[] args) {

		// Escape sequences :A special sequences of character used to represent certain
		// special character in a string.

		// {\t} tab-Character
		// {\n} new line-Character
		// {\"} quotation mark-Character
		// {\\} backslash-character

		System.out.println("\\hello\n How \t are \"you\"?\\\\");

		// output
		// \hello
		// how are "you"?\\
		System.out.println("#####################01#################################");

		// What is the output of these statements?

		System.out.println("\ta\tb\tc");
		System.out.println("\\\\");
		System.out.println("\"\"\"");
		System.out.println("C:\n in\t he downward spiral");

		System.out.println("#######################02################################");

		// - Write a println statement to produce this output?
		// - /\ //\\ ///\\\

		System.out.println("/ \\ // \\\\ /// \\\\\\");

		System.out.println("#########################03##############################");

		// 1st- What println statements will generate this output?

		/*
		 * This program prints a quote form the Gettysburg Address.
		 * 
		 * "Four score and seven years ago, our 'fore father 'brought forth on this
		 * continent a new nation."
		 */

		System.out.println("This program prints a");
		System.out.println("quote form the Gettysburg Address.");
		System.out.println();
		System.out.println("\"Four score and seven years ago,");
		System.out.println("our 'fore father'brought forth on ");
		System.out.println("this continent a new nation.\" ");

		System.out.println("#######################################################");

		// 2nd- What println statements will generate this output?

		/*
		 * A "quoted" String is 'much' better if you learn the rules of
		 * "escape sequences."
		 * 
		 * Also,"" represents an empty String. Don't forget: use \" instead of " ! '' is
		 * not the same as "
		 */
		System.out.println("A \"quoted\" String is");
		System.out.println("'much' better if you learn");
		System.out.println("the rules of \"escape sequences.\" ");
		System.out.println();
		System.out.println("Also,\"\" represents an empty String. ");
		System.out.println("Don't forget: use \\\" instead of \" ! ");
		System.out.println(" '' is not the same as \" ");

	}

}
