package problem4;

public class InvaildArrayException extends Exception{
	public InvaildArrayException() {
		System.out.println("Array entered must be of length greater than 5");
	}
}
