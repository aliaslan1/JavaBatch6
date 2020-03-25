package com.syntax.class06;

import java.util.Scanner;

public class Classtask {
	
   public static void main(String[] args) {
	   
	   /*ask user to enter the month they were born
	    * based on the month define the season
	    * if users born in ja, feb, dec-->winter
	    * if april, may-->spring
	    * if june ,july august-->summer
	    * if september, october, november -->fall
	    * otherwise -->unknown
	    * at the end of the program
	    * "you were born in___"
	    */
	
	   String month;
	   
	   Scanner scan=new Scanner(System.in);
       System.out.println("Month of born");
       month=scan.nextLine();
		
	    String season;
	   
	    if (month.equals("January")||month.equals("February")|| month.equals (" December ") ) {
	    	season= "winter";
	    }else if (month.equals("March")||month.equals("April")||month.equals("Spring ")) {
	    	season= "Spring";
	    }else if (month.equals("June")||month.equals("july")||month.equals("Summer ")) {
	    	season= "Summer";
	    }else if (month.equals("September")||month.equals("october")||month.equals(" ")) {
	    	season= "Fall";
	    }else {
	    	season ="unknown";
	    }
	    System.out.println("You were orn in"+season);
	    System.out.println(month);
}
}
