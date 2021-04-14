
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

	public static void main(String[] arg) {

		String first_name = "Abc";
		System.out.println(first_name + ": " + isValidFirstLastName(first_name));
		
		String last_name = "Xyz";
		System.out.println(last_name + ": " + isValidFirstLastName(last_name));
		
		String email = "abc.xyz@bl.co.in";
		System.out.println(email + ": " + isValidEmail(email));
	}
}