package OOPS.Polymor;

public class Demo {

	public static void main(String[] args) {
		Employee partTime = new PartTime();
		Employee fullTime = new FullTime();
		Employee commission = new Commission();
		
		System.out.println(partTime.toString());
		System.out.println(fullTime.toString());
		System.out.println(commission.toString());
	}

}
