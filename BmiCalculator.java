import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight (in kg) and height (in cm)
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (in cm): ");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "underweight";
        } else if (bmi <= 24.9) {
            status = "normal";
        } else if (bmi <= 39.9) {
            status = "overweight";
        } else {
            status = "obese";
        }

        // Output the BMI and weight status
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}

