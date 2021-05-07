package OOPS.Polymor;

public class Commission extends Employee{

	private double base;
	private double amount;

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param id
	 * @param name
	 * @param sex
	 */
	public Commission(int id, String name, char sex, double base, double amount) {
		super(id, name, sex);
		setBase(base);
		setAmount(amount);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param base
	 * @param amount
	 */
	public Commission() {
		super();
		this.base = 1;
		this.amount = 12;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the amount
	 */  
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	char type() {
		// TODO Auto-generated method stub
		return  'C';
	}

	@Override
	double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
	
		return super.toString() + "\t" + getBase() + "\t" + getAmount();
	}
}
