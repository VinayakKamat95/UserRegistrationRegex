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

	public static void main(String[] arg) {

		String first_name = "Abc";
		System.out.println(first_name + ": " + isValidFirstLastName(first_name));
	}
}