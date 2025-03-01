import java.util.Scanner;

public class AbundantChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        // Variable to store sum of divisors
        int sum = 0;

        // Calculate sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        scanner.close();
    }
}

