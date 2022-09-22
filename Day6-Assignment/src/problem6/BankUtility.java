package problem6;

public class BankUtility {

	public static double calculateTotalInterest(double amount, int years, int interestRate) {
		return (amount * years * interestRate) / 100;
	}
}
