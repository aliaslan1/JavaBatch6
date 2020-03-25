package com.syntax.class07;

public class task {


		/* Create a boolean variable worDay and assign true
		 * create int  variable day and assign it to 1
		 * as long as it is workDay print "I need a day off" and increase the data 
		 * Once day is 6 print "I do not need a day of any more" 		
		 */
	public static void main(String[] args) {
		
		boolean workDay= true;		
		int day=1;
		
		while (workDay) {
			System.out.println("I need a day of");
			if (day==6) {
				System.out.println("I do not need a day of any more");
				workDay=false;
			} 
		day++;
	}    System.out.println("-----------------------");
	
	boolean workDay1= true;		
	int day1=1;
	
	while (workDay1) {
		if (day1==6) {
		workDay1=false;
		System.out.println("I do not need a day of any more");
		
	}else {
		System.out.println("I need a day of");
		
	}day1++;
		
			
			
	}
	
	
	
	
	
	
	
	}
}
