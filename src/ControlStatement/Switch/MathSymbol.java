package ControlStatement.Switch;

public class MathSymbol {

	public static void main(String[] args) {
		 char symbol = '+';
		 switch(symbol) {
		 case '+' : System.out.println("Add"); break;
		 case '-' : System.out.println("Minus"); break;
		 case '*' : System.out.println("Multiply"); break;
		 case '/' : System.out.println("Divide"); break;
		 case '=' : System.out.println("Equal"); break;
		 default : System.out.println("Unregonized"); break;
		 }
	}

}
