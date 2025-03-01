import java.util.Scanner;

public class HarshadChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        // Variables to store sum of digits and original number
        int sum = 0, originalNumber = number;

        // Calculate sum of digits
        while (originalNumber != 0) {
            sum += originalNumber % 10; // Add last digit to sum
            originalNumber /= 10; // Remove last digit
        }

        // Check if number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        scanner.close();
    }
}

