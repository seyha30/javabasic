package LOOPS;

public class Demo {

	public static void main(String[] args) {

//		basic loops
		String str = "Hello World!";
		String forResultString = "";
		String whileResultString = "";
		String doWhileResultString = "";
//		for loop
		int index = str.length() - 1;
		for (int k = str.length() - 1; k >= 0; k--) {
			forResultString += str.charAt(k);
		}

		System.out.println("For loop result :" + forResultString + "\n");
//		while loop
		while (index >= 0) {
			whileResultString += str.charAt(index);
			index--;
		}
		System.out.println("While loop result : " + whileResultString + "\n");
//		do while loop
		int condition = str.length() - 1;
		do {
			doWhileResultString += str.charAt(condition);
			condition--;
		} while (condition >= 0);
		System.out.println("Do While loop result : " + doWhileResultString);
	}

}
