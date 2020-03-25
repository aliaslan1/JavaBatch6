package com.syntax.class10;

public class Task02 {
	

	public static void main(String[] args) {
//		Create an array on integers
//		and calculate the sum of all integer elements in an array


		int [] numbers = {5,10,27,77,99,105,11,3};
		int sum=0;
		for (int i:numbers){
			sum=sum+i;
		}
		System.out.println("The sum of the numbers in this array is :"+ sum);
	}
}
