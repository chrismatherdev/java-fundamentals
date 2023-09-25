package decision_structure;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {

        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        char grade;

        if(score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else if (score < 95) {
            grade = 'A';
        } else {
            grade = 'U';
        }

        System.out.println("Your grade: " + grade);
    }
}
