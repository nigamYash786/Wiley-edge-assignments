package Modify_bankacc_question2;

public class BankMain {

	public static void main(String[] args) {
		BankAccount cust1 = new BankAccount(101, "John Doe", 1000, BankAccountType.SAVINGS);
		BankAccount cust2 = new BankAccount(102, "Rakesh Verma", 2000, BankAccountType.CURRENT);
		BankAccount cust3 = new BankAccount(101, "Shivam Sinha", 5000, BankAccountType.SAVINGS);

		cust1.depositAmount(100);
		cust2.depositAmount(1200);
		cust3.depositAmount(2500);

		cust1.withdrawAmount(200);
		cust2.withdrawAmount(400);

		cust1.displayTotalBalance();
		cust2.getCurrentBalance();
	}

}
