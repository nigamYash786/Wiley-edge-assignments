package Bankacc_question1;

public class BankMain {

	public static void main(String[] args) {
		BankAccount cust1 = new BankAccount(101, "John Doe", 1000);
		BankAccount cust2 = new BankAccount(102, "Rakesh Verma", 2000);
		BankAccount cust3 = new BankAccount(101, "Shivam Sinha", 5000);

		cust1.depositAmount(100);
		cust2.depositAmount(1200);
		cust3.depositAmount(2500);

		cust1.withdrawAmount(200);
		cust2.withdrawAmount(400);

		cust1.displayTotalBalance();
		cust2.getCurrentBalance();
	}

}
