package OOPS.Polymor;

public class FullTime extends Employee{

	private double salary;
	
	public FullTime() {
		super();
		salary = 1.23;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public FullTime(int id, String name, char sex, double salary) {
		super(id, name, sex);
		salary = 100;
	}

	@Override
	char type() {
		// TODO Auto-generated method stub
		return 'F';
	}

	@Override
	double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	double getTax() {
		// TODO Auto-generated method stub
		return 0.123 * getSalary();
	}
	
	public String toString() {
		return super.toString() + "\t" + getSalary();
	}

}
