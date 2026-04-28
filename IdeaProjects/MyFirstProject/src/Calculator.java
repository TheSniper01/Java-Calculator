import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        char choice = 'y';

        do {
            System.out.println("===== CALCULATOR =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.print("Choose option (1-4): ");
            int option = scanner.nextInt();

            if(option < 1 || option > 4){
                System.out.println("invalid input. Try again.");
                continue; // goes back to start of the loop
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            if (option == 1) {
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
            } else if (option == 2) {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
            } else if (option == 3) {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
            } else if (option == 4) {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
            } else {
                System.out.println("Invalid option.");
            }

            System.out.println("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Caluclator closed.");
        scanner.close();
    }
}
