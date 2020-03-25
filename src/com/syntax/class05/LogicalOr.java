package com.syntax.class05;

public class LogicalOr {
	
public static void main(String[] args) {
	//  7days a week
	// if days is 2 or 4 --->SDLC class
	// if day 6 or7--> Java class
	// if day 1 or 5-->no class
	// if day =3--> review class
	
	int day=6;
	
	if (day==2 || day==4){
	System.out.println("SDLC class");
	
    }else if(day==6 || day==7) {    	
    	System.out.println("Java class");
    	
    }else if (day==1 || day==5) {
    	System.out.println("No Class");
    	
    }else if (day==3) {
    	System.out.println("review class");
    	
    }else {
    	System.out.println("Not a Valid day");
    }
	
	// 7days a week
		//if days is Tuesday or Thursday --->SDLC class
		//if day Saturday or  Sunday-> Java class
		//if day Monday or Friday-->no class
		//if day Wednesday--> review class
	
	String weekDay="Sunday";
	
	if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
		System.out.println("SDLC class");	
		
    }else if(weekDay.equals ("Saturday")||weekDay.equals ("Sunday")) {    
    	System.out.println("Java class");
    	
 
    }else if(weekDay.equals ("Monday") || weekDay.equals ("Friday")) {
    	System.out.println("No Class");
    	
    }else if (weekDay.equals ("Wednesday")) {
    	System.out.println("review class");
    	
    }else {
    	System.out.println("Not a Valid day");
	
	
    }
}
}
