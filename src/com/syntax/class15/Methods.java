package com.syntax.class15;

public class Methods {

	// create a method that will say welcome 10 times

	void sayWelcome() {

		for (int i = 0; i < 10; i++) {
			System.out.println("welcome");
		}

	}
	// Create method that will say any word # number of times

	void sayAnyhing(String word, int times) {

		for (int i = 1; i <= times; i++) {
			System.out.println("word");

		}

	}
	// Create method IsItRaining
	// that will accept boolean value as a parameter
	// and base on the value it will print message accordingly.

	void IsItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("it is raining stay home and learn Java");
		}else {
			System.out.println("it is not raining go for a walk");
		}
		
	}
	
		}
	
	

