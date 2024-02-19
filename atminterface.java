import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
            return true;
        }
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        Scanner scanner = new Scanner(System.in);

        switch (option) {
            case 1:
                System.out.println("Current Balance: " + userAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                userAccount.deposit(depositAmount);
                System.out.println("Deposit successful. New balance: " + userAccount.getBalance());
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                userAccount.withdraw(withdrawalAmount);
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
        scanner.close();
    }
}

public class atminterface {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount userAccount = new BankAccount(1000.0);

        // Create an ATM instance with the user's bank account
        ATM atmMachine = new ATM(userAccount);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display ATM menu
            atmMachine.displayMenu();

            // Prompt user for menu option
            System.out.print("Enter option (1-4): ");
            int option = scanner.nextInt();

            // Process user's chosen option
            if (option == 4) {
                // Exit the ATM
                break;
            } else {
                atmMachine.processOption(option);
            }
        }

        // Close the scanner
        scanner.close();
    }
}

