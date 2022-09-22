package problem6;

public class InvalidYearException extends Exception {
	public InvalidYearException() {
		System.out.println("Year must be positive..");
	}
}
