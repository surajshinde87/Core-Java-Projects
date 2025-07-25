
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("===== Welcome to the ATM Machine =======");
            System.out.print("Enter your Card Number: ");
            String cardNumber = scanner.nextLine();

            System.out.print("Enter your Name: ");
            String name = scanner.nextLine();

    
            String pin;
            while (true) {
                System.out.print("Set your 4-digit PIN: ");
                pin = scanner.nextLine();

                if (pin.matches("\\d{4}")) {
                    break;
                } else {
                    System.out.println(" Invalid PIN. Please enter exactly 4 digits.");
                }
            }

            BankAccount account = new BankAccount(cardNumber, name, pin);
            ATMService atmService = new ATMService(account);

            int choice;
            do {
                System.out.println("Enter your choice:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Change PIN");
                System.out.println("4. Check Balance");
                System.out.println("5. Transaction History");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Enter a number: ");
                    scanner.next();
                }

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Amount deposited.");
                    }
                    case 2 -> {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        atmService.performWithdrawal(withdrawalAmount);
                    }
                    case 3 -> {
                        System.out.print("Enter new PIN: ");
                        String newPin = scanner.nextLine();
                        atmService.changePin(newPin);
                    }
                    case 4 ->
                        atmService.showBalance();
                    case 5 -> {
                        System.out.println("Transaction History:");
                        atmService.showMiniStatement();
                    }
                    case 6 ->
                        System.out.println("Exiting ATM. Thank you!");
                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 6);
        }
    }
}
