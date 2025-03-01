import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        // Variable to store the count of digits
        int count = 0;

        // Use a loop to count the number of digits
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++; // Increase the count
        }

        // Output the count of digits
        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}

