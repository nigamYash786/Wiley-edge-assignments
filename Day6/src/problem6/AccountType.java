package problem6;

public enum AccountType {
	SAVINGS(5), CURRENT(7);

	int interestRate;

	private AccountType(int interestRate) {
		this.interestRate = interestRate;
	}

	public int getInterestRate() {
		return this.interestRate;
	}
}
