import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] studentNames = new String[5];
        int[] studentGrades = new int[5];

        int studentCount = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                if (studentCount < 5) {
                    System.out.print("Enter student name: ");
                    studentNames[studentCount] = scanner.nextLine();

                    System.out.print("Enter student grade: ");
                    studentGrades[studentCount] = scanner.nextInt();

                    studentCount++;

                    System.out.println("Student added successfully!");
                } else {
                    System.out.println("Student list is full.");
                }

            } else if (choice == 2) {

                System.out.println("\n===== STUDENT LIST =====");

                if (studentCount == 0) {
                    System.out.println("No students added yet.");
                } else {
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println((i + 1) + ". " + studentNames[i] + " - Grade: " + studentGrades[i]);
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid option. Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
