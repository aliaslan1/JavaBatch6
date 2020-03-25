package com.syntax.class05;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/*
		 * ask user to enter age 
		 * if age is from 1to 3-->you are infant
		 * if age from 3-5-->you are a toddler 
		 * if age from5-12--> you are a kid
		 * if age from 12-19-->you are teeneger
		 * if age >20-->you are an adult
		 */

		
		int age;
		Scanner scan;		
	//"Scanner" do not declare	
		scan=new Scanner (System.in);		
		System.out.println("please entre your age");
	//"int" do not declare
		age=scan.nextInt();
				
		if(age>=1 && age<=3) {
			System.out.println("You are a baby");			
		}else if (age>3 && age<=5) {			
			System.out.println("You are a toddler");
		}else if (age>5 && age<=12){
			System.out.println("You are a kid");
		}else if (age>12 && age <=19){
			System.out.println("You are teeneger");			
		}else if (age>19) {
			System.out.println("You are an adult");
			
			
	}
	}
}
