package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {

	
		 //declare the time (1-24) based on the time identify whether 
		 //if morning,afternoon,evening or night 
		 //if hours between 1-11 -> morning 
		 //if hours between 12-15-> afternoon 
		 //if hours between 16-20 -> evening 
		 //if hours between 21-24 -> night
		 

		int time = 18;
		String timeOfday;

		if (time >= 1 && time <= 11) {
			timeOfday = "Morning";

		} else if (time >= 12 && time <= 15) {
			timeOfday = "Noon";

		} else if (time >= 16 && time <= 20) {
			timeOfday = "Evening";

		} else if (time > 20 && time <= 24) {
			timeOfday = "Night";

		} else {
			timeOfday = "Unknown";
		} 
		// If time of the day is not unknown -->only then I want to the message.

		if (!timeOfday.equals("Unknown")) {
			System.out.println("Right now is " + timeOfday);

		}
	}
}
