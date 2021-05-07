package OOPS.Polymor;

public abstract class Employee {

	private int id;
	private String name;
	private char sex;
	
	abstract char type();
	abstract double getSalary();
	abstract double getTax();
	
	public Employee() {
		id = 1001;
		name = "chan dara";
		sex = 'M';
	}
	
	/**
	 * 
	 */
	public Employee(int id, String name, char sex) {
		// TODO Auto-generated constructor stub
		setId(id);
		setName(name);
		setSex(sex);
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

	
	public String toString() {
		return getId() + "\t" + getName() + "\t" + getSex(); 
	}

}
