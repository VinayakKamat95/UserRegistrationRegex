package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
	
	public static boolean isValidFirstName(String first_Name) {

		String regex = "^[A-Z]{1}[a-z]{2}";
		Pattern p = Pattern.compile(regex);

		if (first_Name == null) {
			return false;
		}

		Matcher m = p.matcher(first_Name);

		return m.matches();
	}

}
