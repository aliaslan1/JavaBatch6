package com.syntax.class05;

public class LogicalAnd {
	
	public static void main(String[]args) {
		
		/*If number is between 1-10--this number is small 
		 *If number is between  11-100--this number is medium
		 * If number is between 101-1000--this number is large
		 * any other number --is out of the range
		 */
	
		int num=200;
		if(num>1 && num<10) {
			System.out.println("this number is small");			
		}else if (num>=10 && num<100) {			
			System.out.println("this number is medium");
		}else if (num>=100 && num<1000){
			System.out.println("this number is lager");
		}else {
			System.out.println("Number is out of the range");
		}
		
	}
	
	/*
	 * LOGICAL OPERATORS: AND (&&) ,OR (||), NOT (!)
	 */

	// if (true AND true)==true
	// if (true AND false)==false
	// if (true AND false)==false
	// if (true AND false)==false

	

}
