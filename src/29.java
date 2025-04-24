import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // User input for student information
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your gender (m/f): ");
        String gender = scanner.next();

        // Generate and display a message for each student
        if (gender.equals("m")) {
            System.out.println("Student " + name + " is male. They are " + age + " years old.");
        } else {
            System.out.println("Student " + name + " is female. They are " + age + " years old.");
        }

        scanner.close();
    }
}
