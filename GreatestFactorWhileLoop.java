class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Initialize the greatest factor variable
        int greatestFactor = 1;
        int counter = number - 1; // Initialize the counter

        // Run a while loop to find the greatest factor
        while (counter > 0) {
            // Check if the number is perfectly divisible by the counter
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Break the loop when the greatest factor is found
            }
            counter--; // Decrement the counter
        }

        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);
    }
}

