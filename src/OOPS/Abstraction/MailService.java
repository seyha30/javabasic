/**
 * 
 */
package OOPS.Abstraction;

/**
 * @author seyhaambee
 *
 */
public class MailService {
	
	public void sendMail() {
		connect();
		authenticate();
		disconnect()
;
		}
	private void connect() {
		System.out.println("Connect");
	}
	
	private void authenticate() {
		System.out.println("Authenticate");
	}
	
	private void disconnect() {
		System.out.println("Disconnect");
	}

}
