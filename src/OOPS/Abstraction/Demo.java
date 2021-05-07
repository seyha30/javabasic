/**
 * 
 */
package OOPS.Abstraction;

/**
 * @author seyhaambee
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reduce complexity by hiding unnecessary details
		// Isolate impact of change
		MailService mail = new MailService();
		mail.sendMail();
	}

}
