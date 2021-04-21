package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationMain {
	
	/*Main function methods from UserRegistration*/
	public static void main(String[] arg) {
			/*Regex pattern for firstNamePattern, lastNamePattern, emailPattern, mobilePattern, paswordPattern*/
			String firstNamePattern = "^[A-Z]{1}[a-z]{2}";
			String lastNamePattern = "^[A-Z]{1}[a-z]{2}";
			String emailPattern ="^[a-z]+.?[a-z]*@[a-z]+.?(co)?.?[a-z]{0,}$";
			String mobilePattern = "^[0-9]{2}\\s{1}[0-9]{10}$";
			String paswordPattern = "[[A-Z]+[a-z]+[0-9]+[!@#$%&*()-+=^]{1}]{8}";
			
			Scanner scanner = new Scanner(System.in);
			/*Lambda function implementation to check pattern matches with input Returns boolean */	
			Ivalidator userRegistration = (pattern, input) ->{
				boolean result = Pattern.matches(pattern, input);
				return result;
			};			
			
			/*Take first name and check for exception to throw custom exception*/
			String first_name = scanner.nextLine(); 
			if(!userRegistration.validateInput(firstNamePattern, first_name)){
				throw new InvalidException("not valid input");
				}
			System.out.println("firstname :" + first_name);	
			
			/*Take last_name and check for exception to throw custom exception*/
			String last_name = scanner.nextLine(); 
			if(!userRegistration.validateInput(lastNamePattern, last_name)){
				throw new InvalidException("not valid input");
				}
			System.out.println("lastname :" + last_name);
			
			/*Take email and check for exception to throw custom exception*/
			String email = scanner.nextLine(); 
			if(!userRegistration.validateInput(emailPattern, email)){
				throw new InvalidException("not valid input");
				}
			System.out.println("email :" + email);
			
			/*Take mobileNumber and check for exception to throw custom exception*/
			String mobileNumber = scanner.nextLine(); 
			if(!userRegistration.validateInput(mobilePattern, mobileNumber)){
				throw new InvalidException("not valid input");
				}
			System.out.println("Mobile_Number :" + mobileNumber);
			
			/*Take password and check for exception to throw custom exception*/
			String password = scanner.nextLine(); 
			if(!userRegistration.validateInput(paswordPattern, password)){
				throw new InvalidException("not valid input");
				}
			System.out.println("Password :" + password);		

	}

}
