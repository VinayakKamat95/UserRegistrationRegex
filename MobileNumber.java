package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
	
	public static boolean isValidMobileNumber(String Mobile_Number) {

		String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern p = Pattern.compile(regex);

		if (Mobile_Number == null) {
			return false;
		}

		Matcher m = p.matcher(Mobile_Number);

		return m.matches();
	}

}
