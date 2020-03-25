package com.syntax.class09;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		/*
	         * write a guessing game where the user has to guess a secret number between 1
	         * and 20 after every guess input, the program tells the user whether their
	         * number was to large or too small. The program will keep asking the user to
	         * enter the number until he finds the correct number. when the correct answer
	         * is found the system should display "congratulations!!. You got it!.
	         */
	    
	        Scanner scan=new Scanner(System.in);
	               		         		        
	        int i=1;
	        do {
	            System.out.println("Guess the lucky number between 1-20 to earn the biggest suprize!!!");
	            i=scan.nextInt();
	            if(i>10) {
	                System.out.println("Sorry!! the number is too big");
	            }else if(i<10) {
	                System.out.println("Sorry!! the number is too small");
	            }
	        }while(i!=10);
	            System.out.println("Congratulations!!!! You got it!!!");
	        }
	}

