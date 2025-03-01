class Factors {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {
            // Run a for loop to find factors
            for (int i = 1; i <= number; i++) {
                // Check if the number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number is not a positive integer");
        }
    }
}

