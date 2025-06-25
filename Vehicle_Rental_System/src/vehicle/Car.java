package vehicle;

public class Car extends Vehicle implements Rentable {

	private int numberOfDoors;

	public Car(String vehicleId, int numberOfDoors) {
        // vehicle id is coming from Vehicle abstract class
		super(vehicleId);
		this.numberOfDoors = numberOfDoors;
	}
	
	
//	This is coming from interface
	@Override
	public void startRental(String customerName) {
		if(isAvailable) {
			toggleAvailability();
			System.out.println("The Car is Rented to : " + customerName);
		}else {
			System.out.println("The Car is Not Available");
		}
	}

	// This is coming from interface
	@Override
	public void endRental() {
		toggleAvailability();
		System.out.println("The Car Rental Ended Return the Car");
	}
	
	// This is coming from Vehicle abstract class
	@Override
	public void displayDetails() {
		System.out.println("Car ID: " + vehicleId + ", Doors: " + numberOfDoors + ", Available: " + isAvailable);

		
	}
	

}
