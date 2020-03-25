package com.syntax.class07;

public class Task03 {

	public static void main(String[] args) {

		// Create a bolean variable WorkDya and assign
		// true create int variable day and assign it to 1

		/*
		 * 01/-As long as it is workDay print "I need a day of" and increase day.
		 * 02/-Once day is 6 print "I do not need a day off anymore.
		 */

		boolean workDay = true;
		int variableDay = 1;

		while (workDay) {

			if (variableDay < 6) {
				System.out.println("I need a day off");
			} else {
				System.out.println("I do not need a day off anymore");
				workDay = false;
			}
			variableDay++;
		}
	}
}
