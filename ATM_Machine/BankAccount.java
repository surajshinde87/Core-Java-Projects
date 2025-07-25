import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String cardNumber;
    private  final String accountHolderName;
    private double balance;
    private String pin;
    private final  List<String> transactionHistory;

    public BankAccount(String cardNumber, String accountHolderName, String pin) {
        this.cardNumber = cardNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Successfully Withdrawal: " + amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public void setPin(String newPin) {
        this.pin = newPin;
    }

    public void addTransaction(String description) {
        transactionHistory.add(description);
    }

    public List<String> getMiniStatement() {
        return transactionHistory;
    }

    public double getBalance() {
        return balance;
    }

    public String getcardNumber() {
        return cardNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getPin() {
        return pin;
    }
}
