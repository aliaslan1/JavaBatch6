package com.syntax.class14;

public class Store {

	// Create a Class “Phone”. Create 3 Objects of it:

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
	}
}
