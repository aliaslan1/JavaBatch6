package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {
		
		//create an array of animals and store 6 elements into it.
		// Using 2 different loops print all elements from the array.
		
		String [] animals ={"Dog","Cat","Lion", "Cow", "Bird"};
		System.out.println("----------1st method----------");
		for (int i=0; i<animals.length; i++){
			System.out.println(animals[i]);
		}
		System.out.println("----------2nd method----------");
		for(String i:animals){
			System.out.println(i);
		}
	}
}
