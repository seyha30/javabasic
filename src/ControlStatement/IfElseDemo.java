package ControlStatement;

import java.util.Scanner;

public class IfElseDemo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter day of week: ");
		String dayOfWeek = in.nextLine();
		String translate = "";
		if("Monday".equalsIgnoreCase(dayOfWeek)) {
			translate = "ថ្ងៃចន្ទ";
		}		
		else if("Thurday".equalsIgnoreCase(dayOfWeek)) {
			translate = "ថ្ងៃអង្គារ";
		}		
		else if("Wednesday".equalsIgnoreCase(dayOfWeek)) {
			translate = "ថ្ងៃពុធ";
		}		
		else if("Turday".equalsIgnoreCase(dayOfWeek)) {
			translate = "ថ្ងៃព្រហស្បតិ៍្ត";
		}		
		else if("Friday".equalsIgnoreCase(dayOfWeek)) {
			translate = "ថ្ងៃសុក្រ";
		}		
		else if("Saturday".equalsIgnoreCase(dayOfWeek)) {
			translate = "ថ្ងៃសៅរ៍";
		}
		else if("Sunday".equalsIgnoreCase(dayOfWeek)) {
			translate = "ថ្ងៃអាទិត្យ";
		}
		else {
			translate = "មិនស្គាល់";
		}
		System.out.println("Name is: " + translate);
	}
}
