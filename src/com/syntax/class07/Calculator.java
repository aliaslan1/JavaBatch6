package com.syntax.class07;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int num1,num2; 
		char op;
		
		
	     System.out.println("please enter first number");
	     num1=scan.nextInt();
	     System.out.println("please enter second number");
	     num2=scan.nextInt();
	     System.out.println("please enter operator (+,-,*,/)");
	     op=scan.next().charAt(0);
	     
	     int result;
	     
	     switch (op) {
	     
	     case '+':
	         result= num1 + num2;
	         break;
	     case '-':
	         result= num1-num2;
	         break;
	     case '*':
	         result= num1*num2;
	         break;
	     case '/':
	         result=num1/num2;
	         break;
	         default:
	        	 System.out.println("Invalid Operator");
	           	    result=0;                      
	             }
	     System.out.println(result);
		
	     		
		
	}

}
