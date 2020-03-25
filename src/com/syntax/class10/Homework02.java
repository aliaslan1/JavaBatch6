package com.syntax.class10;

public class Homework02 {

	public static void main(String[] args) {
//		Create a 2D array that first row will contain 4 names and second row will contain grades. 
//		Then you program should print name of the students that has A and B grade

		String[][] namesGrade = { { "Ali", "Jawid", "Mike", "Usman" }, { "C", "D", "A", "B" } };
		System.out.println(namesGrade[0][0] + " " + namesGrade[1][2]);
		System.out.println(namesGrade[0][2] + " " + namesGrade[1][3]);

	}
}
