package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	
	public static boolean isValidPassword(String Password) {

		String regex = "[[A-Z]+[a-z]+[0-9]+[!@#$%&*()-+=^]{1}]{8}";
		Pattern p = Pattern.compile(regex);

		if (Password == null) {
			return false;
		}

		Matcher m = p.matcher(Password);

		return m.matches();
	}

}
