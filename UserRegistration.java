package com.bridgelabz;

public class UserRegistration {

	public static void main(String[] arg) {

		String first_name = "Abc";
		System.out.println(first_name + ": " + FirstName.isValidFirstName(first_name));
		
		String last_name = "Xyz";
		System.out.println(last_name + ": " + LastName.isValidLastName(last_name));
		
		String email = "abc.xyz@bl.co.in";
		System.out.println(email + ": " + Email.isValidEmail(email));
		
		String mobile_number = "91 9876543210";
		System.out.println(mobile_number + ": " + MobileNumber.isValidMobileNumber(mobile_number));
		
		String password = "Abcd@123";
		System.out.println(password + ": " + Password.isValidPassword(password));
	}
}
