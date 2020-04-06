package com.syntax.class17;

public class StaticKeyword {

	// create a template for a phone
	String color;
	int memory;

	static String brand;
	static boolean touchScreen;

	// return type, name, parameters
	static void displayGeneralInfo() {
		System.out.println("We are building " + brand + " with touch screen = " + touchScreen);
	}

	void displaySpecification() {
		System.out.println("We build phone with " + memory + "GB memory in " + color + "color");
	}

	public static void main(String[] args) {
		
		// accessing static method in a static way
		brand = "iphone";
		touchScreen = true;// boolean value oldugu icin true yada false olmasi gerekiyor

		// accessing instance variables through the instance of the class
		StaticKeyword obj = new StaticKeyword();
		obj.color = "grey";
		obj.memory = 64;

		// accessing static method in a static way
		displayGeneralInfo();// sadece methodun adini yazarak cagiriyoruz
		obj.displayGeneralInfo();// obj ve isim yaziyoruz

		// accessing static methods in non static way/through instance
		obj.displayGeneralInfo(); // valid but not preference
		obj.displayGeneralInfo();

	}
}