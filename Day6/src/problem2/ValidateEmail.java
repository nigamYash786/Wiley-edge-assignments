package problem2;

public class ValidateEmail {

	public static void main(String[] args) {
		String email1 = "mandarmjog@gmail.com";
		String email2 = "wiley@g@.com";
		String email3 = ".wi@.gmail@1234";
		
		try {
			//EmailUtilty.checkValidity(email1);
			//EmailUtilty.checkValidity(email2);
			EmailUtilty.checkValidity(email3);
		}catch(InvalidEmailException ie) {
			System.out.println("Exception occurred: " + ie);
			ie.printStackTrace();
		}
	}

}
