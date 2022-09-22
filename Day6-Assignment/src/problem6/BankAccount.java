package problem6;

public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private AccountType accountType;

	public BankAccount(int accountId, String accountHolderName, AccountType accountType) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public double calculateTotalInterest(double amount, int years) throws DepositAmountException, InvalidYearException {
		if (amount < 0)
			throw new DepositAmountException();
		if (years <= 0)
			throw new InvalidYearException();
		return BankUtility.calculateTotalInterest(amount, years, this.accountType.interestRate);
	}
}
