
import java.util.Scanner;

public class studentgradecalculator {
    public static void main(String[] args) {
        // Input: Take marks obtained in each subject
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();

        double[] marksList = new double[subjects];
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marksList[i] = scanner.nextDouble();
        }

        // Calculate Total Marks
        double totalMarks = 0;
        for (double marks : marksList) {
            totalMarks += marks;
        }

        // Calculate Average Percentage
        double averagePercentage = totalMarks / subjects;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'O';
        } 
        else if (averagePercentage >= 80) {
            grade = 'S';
        } 
        else if (averagePercentage >= 70) {
            grade = 'A';
        } 
        else if (averagePercentage >= 60) {
            grade = 'B';
        }
        else if (averagePercentage >= 50) {
            grade = 'C';
        }  
        else if (averagePercentage >= 40) {
            grade = 'D';
        } 
        else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
