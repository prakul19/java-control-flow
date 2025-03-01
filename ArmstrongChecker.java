import java.util.Scanner;

public class ArmstrongChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        // Variables to store the sum of cubes and the original number
        int sum = 0, originalNumber = number;

        // Check each digit and calculate the sum of cubes
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += Math.pow(digit, 3); // Add the cube of the digit to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

