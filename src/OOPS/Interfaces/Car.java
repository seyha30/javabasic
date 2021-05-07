package OOPS.Interfaces;

public class Car implements Vehicle {

	@Override
	public void breaks() {
		System.out.println("breaks in Car");
	}

	@Override
	public void speeds() {
		System.out.println("speeds in Car");		
	}

}
