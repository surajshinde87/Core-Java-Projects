package vehicle;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car("MH 21 AJ 0244", 4);
		car.startRental("Rushikesh Unge");
		car.endRental();
		car.displayDetails();
		
		
		Bike bike = new Bike("MH 28 BZ 8767", 12);
		bike.startRental("Suraj Shinde");
		bike.endRental();
		bike.displayDetails();
		
		Truck truck = new Truck("MH 12 BS 4545", 15);
		truck.startRental("Avinash Kale");
		truck.displayDetails();
		truck.endRental();
	}

}
