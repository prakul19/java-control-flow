class DivisibilityCheck {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create a variable to store user input for the number
        int number;

        // Take user input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}

