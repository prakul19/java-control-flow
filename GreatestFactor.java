class GreatestFactor {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Initialize the greatest factor variable
        int greatestFactor = 1;

        // Iterate from number - 1 to 1
        for (int i = number - 1; i > 0; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                greatestFactor = i;
                break; // Break the loop when the greatest factor is found
            }
        }

        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);
    }
}

