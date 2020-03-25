package com.syntax.class10;

public class Task {

	public static void main(String[] args) {

		char[] grades={'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		char [] grade=new char [6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		String [] names=new String [4];
		names[0]="Ali";
		names[1]="Veli";
		names[2]="Hasan";		
		names[3]="Huseyin";		
		System.out.println(names [2]);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		String [] names1= {"Ali","Veli","Hasan","Huseyin"};
		System.out.println(names1[3]);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		String [] names0=new String [5];
		names0[0]="Java";
		names0[1]="Saturday";
		names0[2]="Day";		
		names0[3]="Coding";
		names0[4]="is";

		System.out.println("Saturday is "+names0[0]+" coding day");
		

		
		
	}

}
