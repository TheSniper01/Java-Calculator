import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result;

        System.out.print("Enter your first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        if (operator == '+'){
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '*') {
            result = num1 * num2;
        }
        else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Cannot be divided by zero");
                return;
            }
            result = num1 / num2;

        }
            else{
                System.out.println("Invalid operator");
                return;
            }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
