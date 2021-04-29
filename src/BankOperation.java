import java.util.Scanner;

public class BankOperation {

	public static void main(String[] args) {
		double accountBalance = 0.0;
		boolean isContinue = true;
		while (isContinue) {
			System.out.println("Dear value customer , please choose belove options :");
			System.out.println("D : Deposit");
			System.out.println("W : Withdrawal");
			System.out.println("E : Exit program");
			Scanner in = new Scanner(System.in);
			char option = Character.toUpperCase(in.next().charAt(0));
			switch (option) {
			case 'D':
				accountBalance += 10;
				break;
			case 'W':
				if (accountBalance >= 10) {
					accountBalance -= 10;
				} else {
					System.out.println("Account not enough balance");
				}
				break;
			case 'E':
				System.out.println("Exit !");
				isContinue = false;
				break;
			default:
				System.out.println(" Opntion not match");
				break;
			}
			System.out.println("Your current balance is " + accountBalance + "$");
		}

	}

}
