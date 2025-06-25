package vehicle;

public class Truck extends Vehicle implements Rentable {
	private double loadCapacity;

	public Truck(String vehicleId, double loadCapacity) {
        // vehicle id is coming from Vehicle abstract class
		super(vehicleId);
		this.loadCapacity = loadCapacity;
	}

	// This is coming from Rentable Interface
	@Override
	public void startRental(String customerName) {
		if (isAvailable) {
			toggleAvailability();
			System.out.println("The Truck Rented to " + customerName);
		} else {
			System.out.println("The Truck is Not Available to Rent");
		}
	}

	// This is coming from Rentable Interface
	@Override
	public void endRental() {
		toggleAvailability();
		System.out.println("The Truck Rental Ended Here Return the Truck");
	}

	// This is coming from Vehicle Abstract class
	@Override
	public void displayDetails() {
		System.out
				.println("Truck ID: " + vehicleId + ", Capacity: " + loadCapacity + " tons, Available: " + isAvailable);
	}
}
