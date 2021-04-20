package com.bridgelabz;


public class UserRegistrationMain {
	
	/*Main function 
	 * methods from UserRegistration are called */
	public static void main(String[] arg) {
			
		try {
			UserRegistration.isValidFirstName();
		} catch (InvalidException e) {
			e.printStackTrace();
			
		}
		
		try {
			UserRegistration.isValidLastName();
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		
		try {
			UserRegistration.isValidEmail();
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		
		try {
			UserRegistration.isValidMobileNumber();
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		
		try {
			UserRegistration.isValidPassword();
		} catch (InvalidException e) {
			e.printStackTrace();
		}
	
	}

}
