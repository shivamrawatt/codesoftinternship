import java.util.*;

 public class CodeSoftSGC2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        //  array for hold the marks of each subject
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input for marks in each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate the average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determine the grade based on the average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else if (averagePercentage >= 33) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the total marks, average percentage, and grade
        System.out.println("Result");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
