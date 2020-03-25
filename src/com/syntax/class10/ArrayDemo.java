package com.syntax.class10;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] nums=new int [4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;

		//to find #of elements inside an array we use.length(property of an element	
		
		System.out.println(nums.length);
		System.out.println(nums[0]);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		
		String[]array= {"Winte","Fall","Summer","Spring"};
		//I was born in Summer
		System.out.println("I was born in "+array[2]);
		System.out.println(array.length);
		
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		
		String[]array1= {"Winte","Fall","Summer","Spring"};
		//I was born in Summer
		System.out.println("I was born in "+array1[2]);
		//array.length will return an integer
		int arraySize=array1.length;
		System.out.println(arraySize);
		
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			
		int [] score= {80,90,70,100,99};
		
	}

}
