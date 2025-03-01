class Factorial {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number >= 0) {
            int factorial = 1; // Initialize factorial

            // Compute factorial using while loop
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("The number is not positive");
        }
    }
}

