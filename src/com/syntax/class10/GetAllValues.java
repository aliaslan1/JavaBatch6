package com.syntax.class10;

public class GetAllValues {

	public static void main(String[] args) {

		
		 //create an array to store 5 double values , print all in one line.
	       
		double[] values={3.4,1.2,0.6,1.7,3.5};
	    int size1=values.length;
	    for(int k=0;k<size1;k++) {
	    System.out.print(values[k]+" ");
	     
	    }
		System.out.println();
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

	       String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
	       
	       //I want to print all values from an array
	       //when value is dog--> I love dogs 
	       
	       for (int i=0; i<animals.length; i++) {
	    	   
	    	   if(animals [i].equals("Dog")) {
	    		   System.out.println("I love dog");
	    	   }else {
	    		 System.out.println(animals[i]+",");

	    	   } 
	   	    	   

	    	   
	    	 }
		
	    
	    
	    
	    
	}

}
