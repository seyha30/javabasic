package OOPS.Classes;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
	public static void main(String[] args) {

		Employee employee = new Employee();
		List<Employee> list = new ArrayList<Employee>();
		list = employee.getEmployeeList();
		for (Employee emp : list) {
			System.out.println(emp.getGender());
		}
	}
}
