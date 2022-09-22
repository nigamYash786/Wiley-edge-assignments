package Modify_bankacc_question2;

public enum BankAccountType {
	SAVINGS(500), CURRENT(1000);

	int minBalance;

	private BankAccountType(int minBalance) {
		this.minBalance = minBalance;
	}

	public int getMinBalance() {
		return this.minBalance;
	}
}
