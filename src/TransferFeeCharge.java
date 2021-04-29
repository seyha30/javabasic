import java.util.Scanner;

public class TransferFeeCharge {

	public static void main(String[] args) {
		double transferAmount = 1000.0;
		double feeCharge = 0.0;
		boolean isTransfer = true;
		Scanner in = new Scanner(System.in);
		while (isTransfer) {
			System.out.println("Please enter transfer amount : ");
			transferAmount = Double.parseDouble(in.next());
			if (transferAmount <= 1000) {
				feeCharge = 5.0;
			} else if (transferAmount > 1000 && transferAmount <= 10000) {
				feeCharge = 10.0;
			} else if (transferAmount > 10000) {
				feeCharge = 0.12 / 100;
			}
			System.out.println("Fee charged = " + feeCharge);
		}

	}

}
