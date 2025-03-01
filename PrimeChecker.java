import java.util.Scanner;

public class PrimeChecker {

    // Function to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true; // Number is prime
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrime(number);

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}

