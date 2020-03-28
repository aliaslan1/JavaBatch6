package com.syntax.class17;

public class AccessingMembersOfClass {

	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.name = "Faysal";
		emp.lastName = "Shaki";
		emp.salary = 1000;
		// emp. ssn=9087234566; // CE field ssn is not visible ( because ssn declared
		// private)

		Employee.method1();
		emp.method2();
		emp.method3();
		// emp.method4(); CE method4 is not visible (because ssn declared private)

	}

}