class MultiplesWhileLoop {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Check if the number is a positive integer and less than 100
        if (number > 0 && number < 100) {
            int counter = 100; // Initialize counter

            // Find multiples using a while loop
            while (counter >= 1) {
                if (counter % number == 0) { // Check if multiple
                    System.out.println(counter);
                }
                counter--; // Decrement counter
            }
        } else {
            System.out.println("The number is not a positive integer less than 100");
        }
    }
}

