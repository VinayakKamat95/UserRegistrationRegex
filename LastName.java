package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
	
	public static boolean isValidLastName(String last_Name) {

		String regex = "^[A-Z]{1}[a-z]{2}";
		Pattern p = Pattern.compile(regex);

		if (last_Name == null) {
			return false;
		}

		Matcher m = p.matcher(last_Name);

		return m.matches();
	}

}
