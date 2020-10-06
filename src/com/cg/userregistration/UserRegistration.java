package com.cg.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		ValidFirstName();
		ValidLastName();
		validEmailID();
		validMobileNo();
		validPassword();

	}

	public static boolean ValidFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String string = sc.nextLine();
		if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", string)) {
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
		String string = sc.nextLine();
		if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", string)) {
			System.out.println("Not a valid Last Name! Please enter again.");
			return ValidLastName();
		} else {
			System.out.println("Valid Last Name");
			return true;
		}
	}

	public static boolean validEmailID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email");
		String string = sc.nextLine();
		if (Pattern.matches(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$",
				string)) {
			System.out.println("Valid Email");
			return true;
		} else {
			System.out.println("Invalid Email! Please enter again.");
			return validEmailID();
		}
	}

	public static boolean validMobileNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile number along with country code");
		String string = sc.nextLine();
		if (Pattern.matches("[1-9]{1}[0-9]{1}[\\s]{1}[1-9]{1}[0-9]{9}", string)) {
			System.out.println("Valid mobile phone");
			return true;
		} else {
			System.out.println("Invalid mobile number! Please enter again.");
			return validMobileNo();
		}
	}

	public static boolean validPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password");
		String string = sc.nextLine();
		if (Pattern.matches("(.*[A-Z]+.*)", string) && Pattern.matches("[\\S]{8,}", string)
				&& Pattern.matches("(.*[0-9]+.*)", string) && Pattern.matches("(.*[\\W]{1}.*)", string)) {
			System.out.println("Valid password");
			return true;
		} else {
			System.out.println("Invalid password! Please enter again.");
			return validPassword();
		}
	}

}