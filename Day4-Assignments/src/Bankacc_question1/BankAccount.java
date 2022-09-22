package Bankacc_question1;

public class BankAccount {
	int accountId;
	String accountHolderName;
	int openingBalance;
	double currentBalance;
	static double totalBalance;

	public BankAccount(int accountId, String accountHolderName, int openingBalance) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		if (openingBalance < 0)
			return;
		this.openingBalance = openingBalance;
		this.currentBalance = openingBalance;
		totalBalance += this.currentBalance;
	}

	public void depositAmount(double amount) {
		if (amount < 0)
			return;
		this.currentBalance += amount;
		totalBalance += this.currentBalance;
		System.out.println("Thankyou for depositing Rs." + amount);
		System.out.println("Current Balance in your account is: Rs." + this.currentBalance);
		System.out.println("Total available balance in bank is: Rs." + totalBalance);
	}

	public void withdrawAmount(double amount) {
		if (amount < 0 || amount > this.currentBalance) {
			System.out.println("Invalid amount entered.Cannot withdraw");
			return;
		}
		this.currentBalance -= amount;
		totalBalance -= amount;
		System.out.println("Thankyou for your service! Your withdrawn amount is Rs." + amount);
		System.out.println("Current Balance in your account is: Rs." + this.currentBalance);
		System.out.println("Total available balance in bank is: Rs." + totalBalance);
	}

	public void getCurrentBalance() {
		System.out.println("Your current balance is: Rs." + this.currentBalance);
	}

	public void displayTotalBalance() {
		System.out.println("Total cash available with bank is: Rs." + totalBalance);
	}
}
