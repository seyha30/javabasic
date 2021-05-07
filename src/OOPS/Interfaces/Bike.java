package OOPS.Interfaces;

public class Bike implements Vehicle {

	@Override
	public void breaks() {
		System.out.println("breaks in Bike");
	}

	@Override
	public void speeds() {
		System.out.println("speeds in Bike");		
	}

}
