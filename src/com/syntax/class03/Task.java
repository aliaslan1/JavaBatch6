package com.syntax.class03;

public class Task {

	public static void main(String[] args) {

		// create a java program and name it Double Comparison, Declare 2 double values
		// and
		// if value of first variables is higher then second print"Double value_ is
		// largerthan_."

		// Create a java program and make it Temperature Check variable to store
		// temperature.
		// Your program should check if temperature is below 32 then
		// it should print" water will freeze with temperature __." otherwise "water
		// will NOT freeze with temperature_"

		double d1 = 15.5;
		double d2 = 20.8;

		if (d1 < d2) {
			System.out.println("Double value " + d1 + "is larger than" + d2);
		} else {
			System.out.println("Double value " + d1 + " is smaller than " + d2);

		}
		System.out.println("------------------------------");

		int tem1 = 85;
		int tem2 = 32;

		if (tem1 < tem2) {
			System.out.println("Water will freeze with temperature " + tem2);

		} else {
			System.out.println("Water will not freeze temperature " + tem1);

		}

	}

}
