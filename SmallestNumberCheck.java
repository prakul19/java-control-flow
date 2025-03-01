class SmallestNumberCheck {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create variables to store user input for three numbers
        int number1, number2, number3;

        // Take user input for the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        // Take user input for the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        // Take user input for the third number
        System.out.print("Enter the third number: ");
        number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Display the result
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}

