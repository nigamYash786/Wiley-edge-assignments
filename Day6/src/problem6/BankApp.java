package problem6;

public class BankApp {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(101, "John Doe", AccountType.SAVINGS);
		try {
			// System.out.println("Total Interest: " + account.calculateTotalInterest(-2, 7));
			try {
				System.out.println("Total Interest: " + account.calculateTotalInterest(2000, 7));
				// System.out.println("Total Interest: " + account.calculateTotalInterest(2, -7));
			} catch (InvalidYearException e) {
				System.out.println("Invalid year exception..");
				e.printStackTrace();
			}
		} catch (DepositAmountException de) {
			System.out.println("Invaild amount exception !!");
			de.printStackTrace();
		}

	}

}
