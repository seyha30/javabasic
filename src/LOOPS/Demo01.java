package LOOPS;

public class Demo01 {
	public static void main(String[] args) {
//		basic loops
		String str = "Hello World!";
		String forResultString = "";
		String whileResultString = "";
		String doWhileResultString = "";
//		for loop
		int index = 0;
		for (int k = 0; k <= str.length() - 1; k++) {
			forResultString += str.charAt(k);
		}

		System.out.println("For loop result :" + forResultString + "\n");
//		while loop
		while (index <= str.length() - 1) {
			whileResultString += str.charAt(index);
			index++;
		}
		System.out.println("While loop result : " + whileResultString + "\n");
//		do while loop
		int condition = 0;
		do {
			doWhileResultString += str.charAt(condition);
			condition++;
		} while (condition <= str.length() - 1);
		System.out.println("Do While loop result : " + doWhileResultString);
	}

}
