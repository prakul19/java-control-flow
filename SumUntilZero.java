class SumUntilZero {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        double total = 0.0; // Initialize total
        double number; // Variable to store user input

        // Loop until user enters 0
        do {
            System.out.print("Enter a number (0 to end): ");
            number = input.nextDouble();
            if (number != 0) total += number;
        } while (number != 0);

        System.out.println("The total value is " + total);
    }
}

