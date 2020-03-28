package com.syntax.class14;

import java.util.Scanner;

public class Store {
	
	
	// Create an object from phone class
		// instanciate phone class

		// new Phone():--> create an object of phone
		// iphone -->variable/referance variable
		// Phone -->type phone variable

		public static void main(String[] args) {
			Phone iphone = new Phone();
			iphone.brand = "Iphone";
			iphone.color = "White";
			iphone.model = "X Max";
			iphone.dial();
			iphone.text();
			iphone.pics();
			Phone android = new Phone();
			android.brand = "Samsung";
			android.color = "Black";
			android.model = "Note10";
			android.dial();
			android.text();
			android.pics();
			Phone nokia = new Phone();
			nokia.brand = "Nokia";

			nokia.color = "Gray";
			nokia.model = "Nokia 9";
			nokia.dial();
			nokia.text();
			nokia.pics();

			String str = "Hello friends";
			str = str.replace("Hello", "Welcome");

			System.out.println(str);

			Scanner scan = new Scanner(System.in);

			scan.nextLine();
		}
	}


