class LargestNumberCheck {
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

        // Check which number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Display the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}

