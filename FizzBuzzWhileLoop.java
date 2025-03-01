class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {
            int i = 1; // Initialize the loop counter

            // Iterate from 1 to the number using while loop
            while (i <= number) {
                // Check for FizzBuzz, Fizz, or Buzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // Increment the counter
            }
        } else {
            System.out.println("The number is not a positive integer");
        }
    }
}

