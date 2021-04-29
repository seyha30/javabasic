package Form;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class BankForm {

	public static void main(String[] args) {
		
		JFrame form = new JFrame();
	    JButton b1 = new JButton("1");  
	    JButton b2 = new JButton("2");  
	    JButton b3 = new JButton("3");  
	    JButton b4 = new JButton("4");  
	    JButton b5 = new JButton("5");  
	    JButton b6 = new JButton("6");  
	    JButton b7 = new JButton("7");  
	    JButton b8 = new JButton("8");  
	    JButton b9 = new JButton("9");  
	          
	    form.add(b1);
	    form.add(b2);
	    form.add(b3);
	    form.add(b4);
	    form.add(b5);  
	    form.add(b6);
	    form.add(b7);
	    form.add(b8);
	    form.add(b9);  

		form.setSize(300, 300);
		form.setVisible(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLayout(new GridLayout(3,3));  


	}

}
