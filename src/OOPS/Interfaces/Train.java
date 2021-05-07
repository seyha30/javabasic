package OOPS.Interfaces;

public class Train implements Vehicle {

	@Override
	public void breaks() {
		System.out.println("breaks in train");
	}

	@Override
	public void speeds() {
		System.out.println("speeds in train");		
	}

}
