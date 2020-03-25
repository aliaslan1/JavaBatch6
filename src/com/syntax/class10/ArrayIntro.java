package com.syntax.class10;

public class ArrayIntro {

	public static void main(String[] args) {

		int[] nums=new int [3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how can change 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]=nums[2]);//100+3
		
		String [] names=new String [3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";		
		names[3]="Olga";		
		//names[3]="Olga"; during run time we will get an exception
		// ArrayIndexOutOfBoundsException
		System.out.println(names [3]);

		int[] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		
		System.out.println(numbers[0]);
	}

}
