package problem2;
import java.util.regex.*;

public class EmailUtilty {
	public static void checkValidity(String email) throws InvalidEmailException {
		String regex = "^[a-zA-Z0-9]+@[a-zA-Z]+[.]+[a-zA-Z]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches())
			System.out.println("Your email address is valid.");
		else
			throw new InvalidEmailException();
	}
}	
