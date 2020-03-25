package com.syntax.class10;

public class AllValuesFronArray {

	public static void main(String[] args) {
                     // 0   0   2   3   4   5
		char[] grades={'A','B','C','D','E','F'};

		int a=2;
		System.out.println(grades[4]);

		System.out.println(grades[a]);
		
		a+=2;//2+2=4(the result is E)
		System.out.println(grades[a]);
		
		a--;//3
		System.out.println(grades[a]);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");		
//		System.out.println(grades[0]);
//		System.out.println(grades[1]);
//		System.out.println(grades[2]);
//		System.out.println(grades[3]);
//		
       for (int i=1; i<grades.length;i++) {
    	   System.out.println(grades[i]);
       }
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");		

       
       String[] animals= {"Cat","Dog","Cow","Bird","Lion"};
       int size=animals .length;
       
       for (int i=0;i<size;i++) {
    	   System.out.print(animals[i]+",");
    	 }
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");		


      
       
		
	}

}
