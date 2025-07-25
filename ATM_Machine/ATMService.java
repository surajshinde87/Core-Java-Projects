import java.util.List;
import java.util.Scanner;

public class ATMService {

    private BankAccount currentAccount;
    private final Scanner scanner = new Scanner(System.in); 

   
    public ATMService(BankAccount account) {
        this.currentAccount = account;
        System.out.println("Logged in successfully as " + account.getAccountHolderName());
    }

    public void login(BankAccount account) {
        this.currentAccount = account;
        System.out.println("Logged in successfully as " + account.getAccountHolderName());
    }


    public void performWithdrawal(double amount) {
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            String inputPin = scanner.nextLine();

            if (currentAccount.validatePin(inputPin)) {
            
                if (amount <= 0) {
                    System.out.println("Invalid withdrawal amount.");
                    return;
                }

                if (amount > currentAccount.getBalance()) {
                    System.out.println("Insufficient balance.");
                    return;
                }

                currentAccount.withdraw(amount);
                System.out.println("Withdrawal successful. New balance: " + currentAccount.getBalance());
                return;
            } else {
                attempts++;
                System.out.println("Invalid PIN. Attempts left: " + (3 - attempts));
                if (attempts == 3) {
                    System.out.println("Account locked due to too many failed attempts.");
                    return;
                }
            }
        }
    }

    public void performDeposit(double amount) {
        if (currentAccount != null) {
            currentAccount.deposit(amount);
            System.out.println("Deposit successful. New balance: " + currentAccount.getBalance());
        } else {
            System.out.println("No account logged in.");
        }
    }

    public void changePin(String newPin) {
        if (currentAccount != null) {
            currentAccount.setPin(newPin);
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("No account logged in.");
        }
    }

    public void showBalance() {
        if (currentAccount != null) {
            System.out.println("Current balance: " + currentAccount.getBalance());
        } else {
            System.out.println("No account logged in.");
        }
    }

    public void showMiniStatement() {
        if (currentAccount != null) {
            List<String> statement = currentAccount.getMiniStatement();
            System.out.println("Mini Statement:");
            for (String transaction : statement) {
                System.out.println(transaction);
            }
        } else {
            System.out.println("No account logged in.");
        }
    }
}
