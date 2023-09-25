package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // Replaces regular switch (like a JS switch)
        String message = switch (grade) {
            case "A" -> "Excellent job";
            case "B" -> "Well done!";
            case "C" -> "Good job";
            case "F" -> "You need to work a bit harder to improve your grade";
            default -> "Invalid grade provided!";
        };

        System.out.println(message);
    }
}
