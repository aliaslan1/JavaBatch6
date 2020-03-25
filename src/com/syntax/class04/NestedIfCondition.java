package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {

		// Check if patient has any allergies
		// if no allergies-->you are healthy.
		// otherwise check if patient has :
		// orange allergy --> do not eat oranges
		// apple allergy--> do not eat apples
		// kiwi allergy--> do not eat kiwi

		boolean allergy = true;
		boolean appleAllergy = false;
		boolean orangeAllergy = true;
		boolean kiwiAllergy = false;

		if (allergy) {
			System.out.println("Please answer below");
			if (orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
		} else {
			System.out.println("you are healthy");
		}

	}

}
