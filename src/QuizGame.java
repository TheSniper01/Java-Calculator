import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("===== Java Quiz Game =====");

        System.out.println("\nQuestion 1: What data type stores whole numbers?");
        System.out.println("A. double");
        System.out.println("B. int");
        System.out.println("C. boolean");
        System.out.println("Your answer: ");
        char answer1 = scanner.next().charAt(0);

        if(answer1 == 'B' || answer1 =='b'){
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong. The correct answer is B.");
        }

        System.out.println("\nQuestion 2: What data type stores True or False?");
        System.out.println("A. boolean");
        System.out.println("B. char");
        System.out.println("C. int");
        System.out.println("Your answer: ");
        char answer2 = scanner.next().charAt(0);

        if(answer2 == 'A' || answer2 == 'a'){
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong. The correct answer is A.");
        }

        System.out.println("\nQuestion 3: What symbol is used for multiplication is Java?");
        System.out.println("A. x");
        System.out.println("B. *");
        System.out.println("C. #");
        System.out.println("Your answer: ");
        char answer3 = scanner.next().charAt(0);

        if(answer3 == 'B' || answer3 == 'b'){
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong. The correct answer is B");
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Final score: " + score + "/3");

        scanner.close();

    }
}
