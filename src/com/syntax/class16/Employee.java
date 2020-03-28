package com.syntax.class16;

public class Employee {
	/*
	 * Create a Class called Employee: Create three variables eID , salary and set
	 * the CEO to “Sumair” Create two objects of the class Employee Set the value of
	 * eID, salary for each of the objects Print out the eID , salary and CEO for
	 * each of the objects
	 */

	int eID; // instance variable
	int salary;
	static String CEO; // Static variable

	public static void main(String[] args) {
		Employee ob1 = new Employee();

		ob1.eID = 12345;
		ob1.salary = 10000;
		CEO = "Sumair";

		Employee ob2 = new Employee();
		ob2.eID = 2753;
		ob2.salary = 7000;
		System.out.println();

		System.out.println("First Employee's ID is " + ob1.eID + " Salary $" + ob1.salary + " CEO is " + CEO);

		System.out.println("Second Employee's ID is " + ob2.eID + " Salary $" + ob2.salary + " CEO is " + CEO);

	}

}
