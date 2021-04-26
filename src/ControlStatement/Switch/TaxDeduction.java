package ControlStatement.Switch;

public class TaxDeduction {

	public static void main(String[] args) {
		
		double salary = 1000000.0;
		double netSalary = 0;
		
		if(salary >= 1000000 && salary <= 3000000 ) {
			netSalary = salary - (salary*5)/100;
		}
		else if(salary > 3000000 && salary <= 5000000 ) {
			netSalary = salary - (salary*10)/100;
		}
		else if(salary > 5000000 && salary <= 10000000 ) {
			netSalary = salary - (salary*15)/100;
		}
		else if(salary >= 10000000) {
			netSalary = salary - (salary*18)/100;
		}
		else {
			System.out.println("Salary not in rang, good luck");
			netSalary = salary;
		}

		System.out.println("Your net salary is :" + netSalary);

	}

}
