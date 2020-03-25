package com.syntax.class11;

import java.util.Scanner;

public class Task02 {
	
//	Accept username, password and confirm password from a user and check following requirements:
//
//		Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
//		Password should be minimum 8 characters, if less → message=“Password is too short”.
//		Password cannot contain username if so, → message=“Password cannot contain username”.
//		Password should match confirmed password, if not  → message=“Passwords do not match”.
//
//		Only after all requirements met → message “Your username and password has been created”

	public static void main(String[] args) {

		Scanner scan;
		String username;
		String password;
		String confirmedPassword;

		scan = new Scanner(System.in);
		System.out.println("Please enter your username");
		username = scan.nextLine();

		System.out.println("Please enter your password");
		password = scan.nextLine();

		if (!(username.isEmpty() || password.isEmpty())) {
			if (password.length() >= 8) {
				if(!password.contains(username)) {
					System.out.println("Please confirm password");
					confirmedPassword=scan.nextLine();
					
					if(password.equals(confirmedPassword)) {
						System.out.println("Your account is created");
					}else {
						System.out.println("Passwords are not matched");
					}
				}else {
					System.out.println("Password cannot contain username");
				}
			} else {
				System.out.println("Password is too short");
			}
		} else {
			System.out.println("Username and password cannot be empty");
		}
	}
}
