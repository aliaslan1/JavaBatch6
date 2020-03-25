package com.syntax.class04;

import java.util.Scanner;

public class Scannersamples01 {
	
//	The Scanner class is used to get user input, and it is found in the java.util package.
	
//	To use the Scanner class, create an object of the class and use any of the available 
//	methods found in the Scanner class documentation. In our example, 
//	we will use the nextLine(); method, which is used to read Strings:
	
	public static void main(String[] args) {
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");	    

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input
	    
	    System.out.println("---------------other way to create-------------"); 

	    Scanner myObj1 = new Scanner(System.in);
	    String userName1;
	    
	    // Enter username1 and press Enter
	    System.out.println("Enter username"); 
	    userName1 = myObj1.nextLine();   
	       
	    System.out.println("Username is: " + userName1);        
	    
	    
	    
	    
	  }
	
}

	

