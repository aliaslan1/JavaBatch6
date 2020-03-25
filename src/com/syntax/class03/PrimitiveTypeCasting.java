package com.syntax.class03;

public class PrimitiveTypeCasting {
	
	public static void main(String[] args) {
		
	   // FYI- for your information		
		double d=12;
		System.out.println(d);
		
		// int i=12.0; compile time error
		// widening or automatic or implicit casting
		
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		// narrowing or explicit or manual casting
		
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=1000;
		byte b1=(byte)num3;
		System.out.println(b1);
		
		int num4=789;
		byte b2=(byte)num4;
		System.out.println(b2);
		
		
		
	}
			
			
			
			
			
			

}
