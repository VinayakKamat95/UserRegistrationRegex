
import java.util.regex.*;

public class UserRegistration {

	public static boolean isValidFirstLastName(String first_last_Name) {

		String regex = "^[A-Z]{1}[a-z]{2}";
		Pattern p = Pattern.compile(regex);

		if (first_last_Name == null) {
			return false;
		}

		Matcher m = p.matcher(first_last_Name);

		return m.matches();
	}
	
	public static boolean isValidEmail(String email) {

		String regex = "^[a-z]+.?[a-z]*@[a-z]+.?(co)?.?[a-z]{0,}$";
		Pattern p = Pattern.compile(regex);

		if (email == null) {
			return false;
		}

		Matcher m = p.matcher(email);

		return m.matches();
	}
	
	public static boolean isValidMobileNumber(String Mobile_Number) {

		String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern p = Pattern.compile(regex);

		if (Mobile_Number == null) {
			return false;
		}

		Matcher m = p.matcher(Mobile_Number);

		return m.matches();
	}
	
	public static boolean isValidPassword(String Password) {

		String regex = "[]{8,}";
		Pattern p = Pattern.compile(regex);

		if (Password == null) {
			return false;
		}

		Matcher m = p.matcher(Password);

		return m.matches();
	}

	public static void main(String[] arg) {

		String first_name = "Abc";
		System.out.println(first_name + ": " + isValidFirstLastName(first_name));
		
		String last_name = "Xyz";
		System.out.println(last_name + ": " + isValidFirstLastName(last_name));
		
		String email = "abc.xyz@bl.co.in";
		System.out.println(email + ": " + isValidEmail(email));
		
		String mobile_number = "91 9876543210";
		System.out.println(mobile_number + ": " + isValidMobileNumber(mobile_number));
		
		String password = "Abcd@123";
		System.out.println(password + ": " + isValidPassword(password));
	}
}
