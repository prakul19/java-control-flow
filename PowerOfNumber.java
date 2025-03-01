class PowerOfNumber {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number and power
        System.out.print("Enter a positive integer for the base: ");
        int number = input.nextInt();
        System.out.print("Enter a positive integer for the power: ");
        int power = input.nextInt();

        // Check if both inputs are positive integers
        if (number > 0 && power >= 0) {
            int result = 1; // Initialize result

            // Compute the power using a for loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Print the result
            System.out.println(number + " raised to the power of " + power + " is " + result);
        } else {
            System.out.println("Both inputs must be positive integers");
        }
    }
}

