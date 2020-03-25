package com.syntax.class08;

public class Exercises01 {

	public static void main(String[] args) {
		
		//print numbers from 1 to 100 in 1 line		
				for (int i=1; i<=100; i++) {
					System.out.print(i+ " ");
				}
				System.out.println("+++++++++++01++++++++++");

				// print numbers  from 100 to 1
				for (int i=100; i>=1; i--) {
					System.out.println(i);
				}	
				System.out.println("+++++++++++02++++++++++");

				//Print even numbers from 20 to 1(2 ways)
				
				//print odd numbers between 20 and 50(2 ways) 
				
				
				for (int i = 20; i >= 0; i--) {
					   //if number%2 == 0 it means its an even number
					   if (i % 2 == 0) {
						System.out.print(i + " ");
					   }
					}System.out.println("+++++++++++03++++++++++");
								
				
				
				for (int i=20; i<50;i++) {
					System.out.println(i);
				}			
				
				System.out.println("-------------04----------");
				
				
				int sum =0;
				
				for (int i=1; i<=5;i++) {
					sum=sum+i;
					System.out.print(sum+ "+");
				}
					System.out.println();	
					System.out.println(sum);
					
				System.out.println("================05================");
				
				// what is the output
				int sumAll=0;
				for(int i=0; i<=20;i+=5) {
					sumAll=sumAll+i;
				}
				System.out.println(sumAll);
				
	}				

	
	

}
