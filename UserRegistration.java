package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	
	/*Method to check valid input firstname with Regex pattern if input ot valid will throw custom exception
	 * display Not valid and take input again*/
	public static void isValidFirstName() {
		try {	
		System.out.println("firstname");
		Scanner scanner = new Scanner(System.in);
		String regex = "^[A-Z]{1}[a-z]{2}";
		Pattern p = Pattern.compile(regex);
		String first_name = scanner.nextLine(); 		
		Matcher m = p.matcher(first_name);

		 if(!m.matches()) {
			 throw new InvalidException("not valid input");
		 }
		 System.out.println("firstname :" + first_name);
		}catch(InvalidException m){System.out.println("Exception occured: "+m);
		isValidFirstName();
		}  
			 		   
	}
	
	/*Method to check valid input lastname with Regex pattern if input ot valid will throw custom exception
	 * display Not valid and take input again*/
	public static void isValidLastName() {
		try {	
		System.out.println("lastname");
		Scanner scanner = new Scanner(System.in);
		String regex = "^[A-Z]{1}[a-z]{2}";
		Pattern p = Pattern.compile(regex);
		String lastname = scanner.nextLine(); 		
		Matcher m = p.matcher(lastname);

		 if(!m.matches()) {
			 throw new InvalidException("not valid input");
		 }
		 System.out.println("lastname :" + lastname);
		}catch(InvalidException m){System.out.println("Exception occured: "+m);
		isValidLastName();
		}  
			 		   
	}
	

	/*Method to check valid input email with Regex pattern if input ot valid will throw custom exception
	 * display Not valid and take input again*/
	public static void isValidEmail() {
		try {	
			System.out.println("email");
			Scanner scanner = new Scanner(System.in);
			String regex = "^[a-z]+.?[a-z]*@[a-z]+.?(co)?.?[a-z]{0,}$";
			Pattern p = Pattern.compile(regex);
			String email = scanner.nextLine(); 		
			Matcher m = p.matcher(email);
			
			 if(!m.matches()) {
				 throw new InvalidException("not valid input");
			 }
			 System.out.println("email :" + email);
			}catch(InvalidException m){System.out.println("Exception occured: "+m);
			isValidEmail();
			}  
	}
	
	//*Method to check valid input Mobile_Number with Regex pattern if input ot valid will throw custom 
	//exception display Not valid and take input again*//
	public static void isValidMobileNumber()   {
		try {	
			System.out.println("Mobile_Number");
			Scanner scanner = new Scanner(System.in);
			String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
			Pattern p = Pattern.compile(regex);
			String Mobile_Number = scanner.nextLine(); 		
			Matcher m = p.matcher(Mobile_Number);
			
			 if(!m.matches()) {
				 throw new InvalidException("not valid input");
			 }
			 System.out.println("Mobile_Number :" + Mobile_Number);
			}catch(InvalidException m){System.out.println("Exception occured: "+m);
			isValidMobileNumber();
			}  
	}
	
	/*Method to check valid input password with Regex pattern if input ot valid will throw custom exception
	 * display Not valid and take input again*/
	public static void isValidPassword() {
		try {	
			System.out.println("Password");
			Scanner scanner = new Scanner(System.in);
			String regex = "[[A-Z]+[a-z]+[0-9]+[!@#$%&*()-+=^]{1}]{8}";
			Pattern p = Pattern.compile(regex);
			String Password = scanner.nextLine(); 		
			Matcher m = p.matcher(Password);
			
			 if(!m.matches()) {
				 throw new InvalidException("not valid input");
			 }
			 System.out.println("Password :" + Password);
			}catch(InvalidException m){System.out.println("Exception occured: "+m);
			isValidPassword();
			}  
	}
}

