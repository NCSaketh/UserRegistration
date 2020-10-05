package com.cg.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		ValidFirstName();
		ValidLastName();
		validEmailID();

	}

	public static boolean ValidFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", sc.next())) {
			System.out.println("Not a valid First Name! Please enter again.");
			return ValidFirstName();
		} else {
			System.out.println("Valid First Name");
			return true;
		}
	}

	public static boolean ValidLastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name");
		if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", sc.next())) {
			System.out.println("Not a valid Last Name! Please enter again.");
			return ValidLastName();
		} else {
			System.out.println("Valid Last Name");
			return true;
		}
	}
	
	public static boolean validEmailID()
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email");
		if(Pattern.matches("[\\w]{3,}([.][a-zA-Z]{3,})*[@]{1}[a-zA-Z]{2,}[.]{1}[a-zA-Z]{2,}([.][a-zA-Z]{2,})*",sc.next()))
				{
			System.out.println("Valid Email");
			return true;
				}
		else {
			System.out.println("Invalid Email! Please enter again.");
			return validEmailID();
		}
	}
	
}