package com.syntax.class07;

public class WhileLoopPractice {

	public static void main(String[] args) {
		
				//how to print numbers form 1 to 20
		
		int i=1;
		while(i<=20) {
			System.out.println(i);
			i++;
		}
	          // I want to print numbers from 10 to 30 all in one line
		
		int y=10;
		while (y<=30) {
			System.out.println(y);
			y++;
		}
		   // How to print value 10 to 1
		System.out.println("---------01----------");
		int a= 10;
		while (a<=1) {
			System.out.println(a);
			a--;
		}		
		
		//print the value from 50to 20
		System.out.println("--------02----------");
		int b=50;
		while (b>=20) {
			System.out.println(b);
			b--;
		}	
		// I want to print all even numbers from 1 to 20
		// increment value by 2
		System.out.println("--------03----------");
		
		int z=2;
		while (z>=20) {
			System.out.println(z);
			z+=2;
		}
		// 2 way using modulus 
		
		System.out.println("-------04-----------");

		int q=2;
		while(q<=20) {
			System.out.println(".");
			if (q%2==1) {
				System.out.println(q);
			}q++;
			}
				
		System.out.println(">>>>>>>>>05>>>>>>>>>>");

		// print only odd numbers from 50 to 100
		// print only even numbers from 100 to 1
		
		int n=50;
		while (n<100)
		
		if (n%2!=0) {
			System.out.println(n);
		} 
			n++;
			
		int m=100;
		while (m>1) {
			if(m%2==0) {
			System.out.println();
		}
			m--;
		}
	}
		
       
		
		
	}   
		 
		   		   			



