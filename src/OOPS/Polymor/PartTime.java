package OOPS.Polymor;

public class PartTime extends Employee {
	
	


	private double hour;
	private double rate;
	
	
	public PartTime(int id, String name, char sex, double hour, double rate) {
		super(id, name, sex);
		setHour(hour);
		setRate(rate);
	}
	
	public PartTime() {
		super();
		hour = 1;
		rate = 1;
	}

	/**
	 * @return the hour
	 */
	public double getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(double hour) {
		this.hour = hour;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	char type() {
		// TODO Auto-generated method stub
		return 'P';
	}

	@Override
	double getSalary() {
		// TODO Auto-generated method stub
		return getHour() * getRate();
	}

	@Override
	double getTax() {
		// TODO Auto-generated method stub
		return 0.15 * getSalary();
	}
	
	public String toString() {
		return super.toString() + "\t" + getHour() + "\t" + getRate();
	}

}
