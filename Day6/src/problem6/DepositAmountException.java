package problem6;

public class DepositAmountException extends Exception{
	public DepositAmountException() {
		System.out.println("Entered amount is negative...");
	}
}
