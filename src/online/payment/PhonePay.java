package online.payment;

public class PhonePay implements Payment{

	 @Override
	    public void makePayment(double amount) {
	        System.out.println("Paid ₹" + amount + " using Phone Pay.");
	    }
}
