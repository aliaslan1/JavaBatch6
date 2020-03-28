package com.syntax.class16;

public class Students {
	/*
	 * Create a Class called Students Create three variables studentName , studentID
	 * and numberOfStudents Create three objects of the Students Class Set the value
	 * for studentName , studentID and increment the numberOfStudents for each
	 * object Print out total number of students
	 */

	String name; // instance variable
	int ID; // instance variable

	static int numberOfStudents = 0; // Static variable

	public static void main(String[] args) {

		Students std1 = new Students();
		std1.name = "Rafael";
		std1.ID = 2365;
		numberOfStudents++;

		Students std2 = new Students();
		std2.name = "Jose";
		std2.ID = 2758;
		numberOfStudents++;

		Students std3 = new Students();
		std3.name = "Lorena";
		std3.ID = 2759;
		numberOfStudents++;

		System.out.println(" First student names is " + std1.name + " his ID is " + std1.ID);

		System.out.println(" Second student names is " + std2.name + " his ID is " + std2.ID);

		System.out.println(" Third student names is " + std3.name + " her ID is " + std3.ID);

		System.out.println(" Total number of  students in class is " + numberOfStudents);
	}

}