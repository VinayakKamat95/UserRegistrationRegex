package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	
	public static boolean isValidEmail(String email) {

		String regex = "^[a-z]+.?[a-z]*@[a-z]+.?(co)?.?[a-z]{0,}$";
		Pattern p = Pattern.compile(regex);

		if (email == null) {
			return false;
		}

		Matcher m = p.matcher(email);

		return m.matches();
	}

}
