import java.util.*;
      

class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs." + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrawn: Rs." + amount);
                return true;
            } else {
                System.out.println("Insufficient balance.");
                return false;
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}








class ATM  {
    private BankAccount account;

    // Constructor to link ATM with BankAccount
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Method to display options and process user input
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the ATM. Please choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    // Method to check balance
    private void checkBalance() {
        System.out.println("Your current balance is: RS." + account.getBalance());
    }

    // Method to deposit money
    private void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: Rs.");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    // Method to withdraw money
    private void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: Rs.");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}
 
 











class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(1000.00);

        // Create an ATM and connect it with the bank account
        ATM atm = new ATM(account);

        // Start the ATM interface
        atm.start();
    }
}










