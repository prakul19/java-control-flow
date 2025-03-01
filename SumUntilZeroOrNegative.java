class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        double total = 0.0; // Initialize total
        double number; // Variable to store user input

        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to end): ");
            number = input.nextDouble();
            
            // Break loop if 0 or negative
            if (number <= 0) break;
            
            // Add to total
            total += number; 
        }

        // Display total
        System.out.println("The total value is " + total);
    }
}

