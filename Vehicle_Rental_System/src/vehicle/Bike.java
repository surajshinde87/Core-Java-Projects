package vehicle;

public class Bike extends Vehicle implements Rentable {

	private int engineCapacity;

	public Bike(String vehicleId, int engineCapacity) {
        // vehicle id is coming from Vehicle abstract class
		super(vehicleId);
		this.engineCapacity = engineCapacity;
	}

	// This is coming from Rentable Interface
	@Override
	public void startRental(String customerName) {
		if (isAvailable) {
			toggleAvailability();
			System.out.println("The Bike is Rented to : " + customerName);
		} else {
			System.out.println("The Bike is Not Availble to Rent");
		}
	}

	// This is coming from Rentable Interface
	@Override
	public void endRental() {
		toggleAvailability();
		System.out.println("The Bike Rental Ended Return the Bike");
	}

	// This is coming from Vehicle abstract class
	@Override
	public void displayDetails() {
		System.out.println(
				"Bike ID: " + vehicleId + ", Engine Capacity: " + engineCapacity + ", Available: " + isAvailable);
	}

}
