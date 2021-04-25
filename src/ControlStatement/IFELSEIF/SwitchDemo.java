package ControlStatement.IFELSEIF;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lightColor = "red";
		switch(lightColor) {
		case "blue" : System.out.println("Go !"); break;
		case "red" : System.out.println("Stop!"); break;
		case "yellow" : System.out.println("Slow down"); break;
		default: System.out.println("Traffic light color not match!");
		}

	}

}




