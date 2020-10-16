package com.cg.userregistration;


import java.util.Scanner;

import java.util.regex.Pattern;

public static class User {

    @FunctionalInterface
    interface Validate {
        boolean Check(String str);
    }

    public boolean Operation(String str, Validate validate) {
        return validate.Check(str);
    }

    public static void main(String[] args) {
        try {
            ValidFirstName.Check(null);
            ValidLastName.Check(null);
            validEmailID.Check(null);
            validMobileNo.Check(null);
            validPassword.Check(null);
        } catch (Exception e) {
            e.printStackTrace();

        }
        }


		/*User.ValidFirstName.Check(null);
		User.ValidLastName(null);
		validEmailID(null);
		validMobileNo(null);
		validPassword(null);
*/




        public static Validate ValidFirstName = (String firstname) -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name");
            String string = sc.nextLine();
            try {
                if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", string)) {
                    throw new InvalidDetailsException(string);
                } else {
                    System.out.println("Valid First Name");
                    return true;
                }
            } catch (InvalidDetailsException e) {
                return false;
            }
        };

        public static Validate lastNameCheck = (String str) -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Last Name");
            String string = sc.nextLine();

            try {
                if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", string)) {
                    throw new InvalidDetailsException(string);
                } else {
                    System.out.println("Valid Last Name");
                    return true;
                }
            } catch (InvalidDetailsException e) {
                return false;
            }
        };

        public static Validate emailCheck = (String str) -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your email");
            String string = sc.nextLine();
            try {
                if (Pattern.matches(
                        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$",
                        string)) {
                    System.out.println("Valid Email");
                    return true;
                } else {
                    throw new InvalidDetailsException();
                }
            } catch (InvalidDetailsException e) {
                return false;
            }
        };

        public static Validate validMobileNo = (String string2) -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your mobile number along with country code");
            String string = sc.nextLine();
            try {
                if (Pattern.matches("[1-9]{1}[0-9]{1}[\\s]{1}[1-9]{1}[0-9]{9}", string)) {
                    System.out.println("Valid mobile phone");
                    return true;
                } else {
                    throw new InvalidDetailsException(string);
                }
            } catch (InvalidDetailsException e) {
                return false;
            }
        };

        public static Validate validPassword = (String string2) -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your password");
            String string = sc.nextLine();
            try {
                if (Pattern.matches("(.*[A-Z]+.*)", string) && Pattern.matches("[\\S]{8,}", string)
                        && Pattern.matches("(.*[0-9]+.*)", string) && Pattern.matches("(.*[\\W]{1}.*)", string)) {
                    System.out.println("Valid password");
                    return true;
                } else {
                    throw new InvalidDetailsException(string);
                }
            } catch (InvalidDetailsException e) {
                return false;
            }
        };

