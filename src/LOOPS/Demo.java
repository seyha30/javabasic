package LOOPS;

public class Demo {

	public static void main(String[] args) {

//		basic loops
		String str = "Hello World!";
		int index = str.length() - 1;
		System.out.println("For loop");
		for (int k = 0; k < str.length(); k++) {
			System.out.println(str.charAt(k));

		}
		System.out.println("While loop");
		while (index >= 0) {
			System.out.println(str.charAt(index));
			index--;
		}
		System.out.println("Do While loop");
		int condition = str.length() - 1;
		do {
			System.out.println(str.charAt(condition));
			condition--;
		} while (condition >= 0);
	}

}
