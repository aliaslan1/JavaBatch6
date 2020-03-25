package com.syntax.class05;

import java.util.Scanner;

public class Homework3 {
	
	public static void main(String[] args) {

		// Write a program that will read three inputs of scores (quiz, mid term,
		// and final scores) and determine the grade based on the following rules:

		// -if the average score >=90 → grade=A.
		// -if the average score >= 70 and <90 → grade=B.
		// -if the average score>=50 and <70 → grade=C.
		// -if the average score<50 → grade=F

		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter your quiz score");
		int quiz = scan.nextInt();	
		System.out.println("Enter your mid term score");
		int midTerm = scan.nextInt();
		System.out.println("Enter your final score");
		int finalScore = scan.nextInt();
		
		double average = quiz=midTerm=finalScore;
		String score =scan.nextLine();	
		
		if (average>=90) {
			score="'A'";
		}else if (average >=70 && average >=90) {
			score="'B'";
		}else if (average >=50 && average >=70) {
			score="'C'";
		}else {
			score="'F'";
		}
		System.out.println("Your average grade is "+score);

		}
	}
