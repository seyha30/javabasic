package OOPS.Interfaces;

public class Demo {

	public static void main(String[] args) {
//		create object individual way
		Car car = new Car();
		car.speeds();
		car.breaks();
		Bike bike = new Bike();
		bike.speeds();
		bike.breaks();
		Train train = new Train();
		train.speeds();
		train.breaks();
//		create by composite way
		Vehicle vehicle = new Car();
		vehicle.breaks();
		vehicle.speeds();
//		OR 
//		Vehicle vehicle = new Bike();
//		vehicle.breaks();
//		vehicle.speeds();
	}

}
