package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input;
        int day;
        System.out.println("please enter a day number");
        input = new Scanner(System.in);
        day = input.nextInt();
        if (day >= 1 && day <= 5)
            System.out.println("It is a weekday");
        else if (day >= 6 || day <= 7)
            System.out.println("It is a weekend");
        else
            System.out.println("Invalid day");
    }
}




