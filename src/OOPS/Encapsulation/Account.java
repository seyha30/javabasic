/**
 * 
 */
package OOPS.Encapsulation;

/**
 * @author seyhaambee
 *
 */
public class Account {
	
	private float balance;
	
	public void deposit(float amount) {
		if(amount > 0)
			this.balance += amount;	
	}
	
	public void withdraw(float amount) {
		if(this.balance > 0 && this.balance >= amount)
			this.balance += amount;
		else
			System.out.println("Not enough balance !");
			
	}
	
	public void setBalance(float balance) {
		if(balance > 0)
			this.balance += balance;	
	}
	
	public float getBalance() {
		return balance;
	}
		


}
