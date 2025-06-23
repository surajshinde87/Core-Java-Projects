package online.payment;

import java.util.Scanner;

public class PaymentDemo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the amount to make payment");
    double amount = sc.nextDouble();
    
    System.out.println("Choose Payment Option");
    System.out.println(" 1. PhonePay");
    System.out.println(" 2. Credit Card");
    System.out.println(" 3. UPI");
    int choice = sc.nextInt();
    
    Payment payment;
    
    switch (choice) {
	case 1: 
		payment = new PhonePay();
		break;
	case 2: 
		payment = new CreditCard();
		break;
	case 3: 
		payment = new UPI();
		break;
	
	default:
		System.out.println("Invalid Choice");
		return;
	}
    
    payment.makePayment(amount);
		
	}

}
