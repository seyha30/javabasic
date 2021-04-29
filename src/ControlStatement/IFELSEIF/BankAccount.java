package ControlStatement.IFELSEIF;

public class BankAccount {

	public static void main(String[] args) {

//		String transactionType = "Deposit";
		String transactionType = "Withdraw";
		double accountBalance = 100.0;
		if ("Deposit".equalsIgnoreCase(transactionType)) {
			accountBalance++;
		} else if ("Withdraw".equalsIgnoreCase(transactionType)) {
			if (accountBalance > 0) {
				accountBalance--;
			} else {
				System.out.println("Account not enough balance");
			}
		}
		System.out.println("Current Account Balance is :" + accountBalance);
	}

}
