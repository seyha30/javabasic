package IFELSEIF;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DayTranslate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String daysOfWeek = "";
		String translate = "";
		daysOfWeek  = JOptionPane.showInputDialog( null,"Enter day of week");
		if("Monday".equalsIgnoreCase(daysOfWeek)) {
			translate = "ថ្ងៃចន្ទ";
		}		
		else if("Tuesday".equalsIgnoreCase(daysOfWeek)) {
			translate = "ថ្ងៃអង្គារ";
		}		
		else if("Wednesday".equalsIgnoreCase(daysOfWeek)) {
			translate = "ថ្ងៃពុធ";
		}		
		else if("Thursday".equalsIgnoreCase(daysOfWeek)) {
			translate = "ថ្ងៃព្រហស្បតិ៍្ត";
		}		
		else if("Friday".equalsIgnoreCase(daysOfWeek)) {
			translate = "ថ្ងៃសុក្រ";
		}		
		else if("Saturday".equalsIgnoreCase(daysOfWeek)) {
			translate = "ថ្ងៃសៅរ៍";
		}
		else if("Sunday".equalsIgnoreCase(daysOfWeek)) {
			translate = "ថ្ងៃអាទិត្យ";
		}
		else {
			translate = "មិនស្គាល់";
		}
		JOptionPane.showMessageDialog(null, translate);

	}

}
