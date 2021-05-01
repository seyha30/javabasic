import java.util.Scanner;

public class CoffeeOrder {

	public static void main(String[] args) {

		System.out.println("Welcome to our coffee shop");
		Scanner scanner = new Scanner(System.in);
		boolean isExitProgram = true;
		System.out.println("O : Order");
		System.out.println("P : Print Invoice");
		System.out.println("E : Exit Program");
		while (isExitProgram) {

			char option = Character.toUpperCase(scanner.next().charAt(0));
			switch (option) {
			case 'O':
				Boolean isorder = true;
				do {
					System.out.println("1 : Cappuccino");
					System.out.println("2 : ESPRESSO");
					System.out.println("3 : ICELATTE");
					System.out.println("4 : AMERICANO");
					Integer onInteger = scanner.nextInt();
					if (onInteger == CoffeeType.AMERICANO.getKey()) {
						System.out.println("Enter qty");
						int qty = scanner.nextInt();
					} else if (onInteger == CoffeeType.CAPPUCCINO.getKey()) {
						System.out.println("Enter qty");
						int qty = scanner.nextInt();

					} else if (onInteger == CoffeeType.ESPRESSO.getKey()) {
						System.out.println("Enter qty");
						int qty = scanner.nextInt();
					} else if (onInteger == CoffeeType.ICELATTE.getKey()) {
						System.out.println("Enter qty");
						int qty = scanner.nextInt();
					}else {
						System.out.println("Ha not such as that coffee type");
					}
					System.out.println("More order ?");
					
				} while (isorder);

				break;
			case 'P':
				System.out.println("Invoice");
				break;
			case 'E':
				isExitProgram = false;
				System.out.println("Exit !");
				break;

			default:
				break;
			}
		}

	}

}
