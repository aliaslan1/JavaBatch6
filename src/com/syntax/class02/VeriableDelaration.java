package com.syntax.class02;

public class VeriableDelaration {
	
	public static void main (String[] args) {		
		
		        //1.declare variables num1 that will hold value of int and 
				// assigning/initializing value of 123 to it 
					
				int num1=123;
				int num2=6767;
				int num3=786876;
				byte num5=55;			
				char num4='A';
					
				//2. declara variable first and then assign value
				
				int n1;
				int n2;
				int n6;
					
				n1=56;
				n2=7676;
				n6=767;
										
				//3. declare all variables together and then later assign the value
				
				int number1, number2, number3;
				
				number1=12;
				number2=15;
				number3=676;
				
				//System.out.println(number3);
				
				number3=1000;
				System.out.println(number3);
				
				boolean var=true;
				
				System.out.println(var);
				
				//char myVariables;='*'; this is true
				//char myVariables; this is correct as well
				//myVariables='*';
					
				
				char myVariables;				
				//char myVariables='^'; This verification and value can also work.

				myVariables='*';				
				System.out.println(myVariables);
								
				number2=number1;// (number2);							
				System.out.println(number2);
				
				// number2=false;--. compiler time error asking to change data type of
				//variable number2 to boolean
				
				boolean isRain=false; 
				boolean isSnow=true;
				isSnow=isRain;// isSnow=isFalse
				System.out.println(isSnow); //the variable answer is "false" because the execution goes from top top the buttom and issnow is equal to is false
				
				isSnow=true;			
				System.out.println(isSnow);
				
				
				

		
		
	}
	

}

