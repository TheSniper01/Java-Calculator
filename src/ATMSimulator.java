import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1000.00;
        int choice;

        do {
            System.out.println("\n===== ATM SIMULATOR =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your current balance is: $" + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double deposit = scanner.nextDouble();

                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Deposit successful.");
                    System.out.println("New balance: $" + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            }
            else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                double withdraw = scanner.nextDouble();

                if (withdraw > balance) {
                    System.out.println("Insufficient funds.");
                } else if (withdraw <= 0) {
                    System.out.println("Invalid withdrawal amount.");
                } else {
                    balance -= withdraw;
                    System.out.println("Withdrawal successful.");
                    System.out.println("New balance: $" + balance);
                }
            }
            else if (choice == 4) {
                System.out.println("Thank you for using the ATM.");
            }
            else {
                System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
