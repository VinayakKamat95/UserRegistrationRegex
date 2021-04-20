package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	
	/*Method to check valid input firstname with Regex pattern and Lambda function if input not valid will throw custom exception
	 * display Not valid and take input again*/
	public static void isValidFirstName() throws InvalidException {		
		String firstNamePattern = "^[A-Z]{1}[a-z]{2}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstname");
		String first_name = scanner.nextLine(); 	
		Ivalidator userRegistration = (pattern, input) ->{
			boolean result = Pattern.matches(pattern, input);
			return result;
		};			
		if(!userRegistration.validateInput(firstNamePattern, first_name)){
			throw new InvalidException("not valid input");
			}
		System.out.println("firstname :" + first_name);		
	}  			 		   
	
	
	/*Method to check valid input lastname with Regex pattern and Lambda function if input not valid will throw custom exception
	 * display Not valid and take input again*/
	public static void isValidLastName() throws InvalidException {		
		String lastNamePattern = "^[A-Z]{1}[a-z]{2}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("lastname");
		String lastname = scanner.nextLine(); 
		Ivalidator userRegistration = (pattern, input) ->{
			boolean result = Pattern.matches(pattern, input);
			return result;
		};					
		if(!userRegistration.validateInput(lastNamePattern, lastname)){
			throw new InvalidException("not valid input");
			}
		 
		 System.out.println("lastname :" + lastname);
	}
		  

	/*Method to check valid input email with Regex pattern and Lambda function if input not valid will throw custom exception
	 * display Not valid */
	public static void isValidEmail() throws InvalidException {		
		String emailPattern ="^[a-z]+.?[a-z]*@[a-z]+.?(co)?.?[a-z]{0,}$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Email");
		String email = scanner.nextLine(); 
		Ivalidator userRegistration = (pattern, input) ->{
			boolean result = Pattern.matches(pattern, input);
			return result;
		};					
		if(!userRegistration.validateInput(emailPattern, email)){
			throw new InvalidException("not valid input");
			}
		 
		 System.out.println("email :" + email);
	}
	
	//*Method to check valid input Mobile_Number with Regex and Lambda function pattern if input not valid will throw custom 
	//exception display Not valid *//
	public static void isValidMobileNumber() throws InvalidException {		
		String mobilePattern = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mobile_Number");
		String Mobile_Number = scanner.nextLine(); 
		Ivalidator userRegistration = (pattern, input) ->{
			boolean result = Pattern.matches(pattern, input);
			return result;
		};					
		if(!userRegistration.validateInput(mobilePattern, Mobile_Number)){
			throw new InvalidException("not valid input");
			}
		 
		 System.out.println("Mobile_Number :" + Mobile_Number);
	}
	
	/*Method to check valid input password with Regex pattern and Lambda function if input not valid will throw custom exception
	 * display Not valid */
	public static void isValidPassword() throws InvalidException {		
		String paswordPattern = "[[A-Z]+[a-z]+[0-9]+[!@#$%&*()-+=^]{1}]{8}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Password");
		String password = scanner.nextLine(); 
		Ivalidator userRegistration = (pattern, input) ->{
			boolean result = Pattern.matches(pattern, input);
			return result;
		};					
		if(!userRegistration.validateInput(paswordPattern, password)){
			throw new InvalidException("not valid input");
			}
		 
		 System.out.println("Password :" + password);
	}
}

