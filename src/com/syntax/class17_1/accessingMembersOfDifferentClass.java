package com.syntax.class17_1;

public class accessingMembersOfDifferentClass {
	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.name="Ahmet";
		//below variable not available due to restriction
//		emp.lastName="Smith";  // protected 
//		emp.salary=9000;        //default 
//		emp. ssn=908776766;     //private
//	

		Employee.method1(); // public
		//below variable not available due to restriction
//		emp.method2(); // protected 
//		emp.method3(); //default 
//		emp.method4();  //private
//		
		// only public can visible everywhere

	}

}