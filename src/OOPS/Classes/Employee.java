package OOPS.Classes;

import java.util.List;

public class Employee {
	String name;
	char gender;
	double salary;
	String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", salary=" + salary + ", phone=" + phone + "]";
	}

	public Employee(String name, char gender, double salary, String phone) {
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.phone = phone;
	}

	public Employee() {

	}

	public List<Employee> getEmployeeList() {
		return List.of(
				new Employee("seyha", 'M', 100, "010366946"), new Employee("kanha", 'F', 300, "010386946"),
				new Employee("bopha", 'F', 400, "010366947"), new Employee("channy", 'M', 100, "010366948"),
				new Employee("kengty", 'M', 100, "010366949"), new Employee("saret", 'M', 100, "010366966"),
				new Employee("sovan", 'M', 100, "010366946")
				);

	}

}
