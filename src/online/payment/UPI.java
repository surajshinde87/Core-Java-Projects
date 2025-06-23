package online.payment;

public class UPI implements Payment {
	
	 @Override
	    public void makePayment(double amount) {
	        System.out.println("Paid ₹" + amount + " using UPI.");
	    }
}
