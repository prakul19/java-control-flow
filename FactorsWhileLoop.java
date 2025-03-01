class FactorsWhileLoop {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {
            int i = 1; // Initialize the counter

            // Run a while loop to find factors
            while (i <= number) {
                // Check if the number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++; // Increment the counter
            }
        } else {
            System.out.println("The number is not a positive integer");
        }
    }
}

