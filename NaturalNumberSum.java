class NaturalNumberSum {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create a variable to store user input for the number
        int number;

        // Take user input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check if the number is a positive integer (natural number)
        if (number >= 0) {
            // Calculate the sum of the first n natural numbers
            int sum = number * (number + 1) / 2;
            // Display the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Display that the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}

