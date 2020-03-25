package com.syntax.class04;

public class NestedIfPractice {

	public static void main(String[] args) {

		// if today is Friday only day I want to go to horror movie

		boolean isFriday = false;
		int day = 13;

		if (isFriday) {
			System.out.println("Today is Friday");
			if (day == 13) {
				System.out.println("I will watch horror movies");
			} else {
				System.out.println("I will watch comedy");
			}
		} else {
			System.out.println("Today is NOT Friday");
		}
	}

}
