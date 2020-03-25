package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
				
	    	int time =8;
		
	    	if (time<12) { //condition is true
			System.out.println("Good morning");//code executes 1
			
			}	
			System.out.println("--------------");
			
			while (time<12) {// while condition is true
				System.out.println("Good morning");
				time++;
			}
			//I want to print GA 5 times
			
			int i=-1;
			
			while (i<4) {
				System.out.println("Good afternoon");
				
				i++;				
			}
			System.out.println("Outside of the loop");
			
			System.out.println("--------------Odd,Odd,Odd,Odd---------------");

			 int a=1;
			    //start your code here
			    //Create a while loops that prints out "Odd" numbers from 1 to 13
			    //Must not include the number 13 in the output 
			 while (a<=13){
			      
			 System.out.println(a);
			      a+=2;
	
	}			System.out.println("--------------even,even,even,even,---------------");

			 int a1=1;
			    //start your code here
			    
			    while (a1<=12){
			      a1=a1+1;
			      if(a1%2==0){
			      System.out.println(" "+a1);
			     
			    }
			    
			    } 
}
}