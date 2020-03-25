package com.syntax.class07;

public class IncrementinAndDecrementing {
	public static void main(String[] args) {
		

	int a=10;
	
	a=a+1; // assignment
	a+=1; // shorthand assignment
	
	System.out.println(a); //12
	
	
	a++; //increment operator
	
	int b=10;
	
	b-=1; // 9
	b--; // decrement operator
	
	System.out.println(b);
	
	//increment & decrement operators can be used
	// only with variables
	
	int c=23;
	c++;
	//1++ ;  --> ERROR compiler error invalid argument

}
}