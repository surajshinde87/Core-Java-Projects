package vehicle;

public abstract class Vehicle implements Rentable {

	protected String vehicleId;
	protected boolean isAvailable;

	public Vehicle(String vehicleId) {
		this.vehicleId = vehicleId;
		this.isAvailable = true;
	}

	public void toggleAvailability() {
		isAvailable = !isAvailable;
	}

	public abstract void displayDetails();
}
