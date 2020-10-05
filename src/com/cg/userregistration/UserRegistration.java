package com.cg.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		ValidFirstName();

	}

	public static boolean ValidFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", sc.next())) {
			System.out.println("Not a valid First Name , Please repeat.");
			return ValidFirstName();
		} else {
			System.out.println("Valid First Name");
			return true;
		}
	}

}