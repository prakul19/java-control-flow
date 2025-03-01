import java.util.Scanner;

public class MarksCalculator {

    // Function to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "Grade: A\nRemarks: Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            return "Grade: B\nRemarks: Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            return "Grade: C\nRemarks: Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            return "Grade: D\nRemarks: Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            return "Grade: E\nRemarks: Level 1, too below agency-normalized standards";
        } else {
            return "Grade: R\nRemarks: Remedial standards";
        }
    }

    // Function to compute average marks and percentage
    public static double computeAverage(double physics, double chemistry, double maths) {
        return (physics + chemistry + maths) / 3;
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        // Compute average marks and percentage
        double averageMarks = computeAverage(physics, chemistry, maths);
        double percentage = (averageMarks / 100) * 100;

        // Calculate grade and remarks
        String gradeRemarks = calculateGrade(percentage);

        // Output the results
        System.out.printf("Average Marks: %.2f%n", averageMarks);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println(gradeRemarks);

        scanner.close();
    }
}

