class Multiples {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Check if the number is a positive integer and less than 100
        if (number > 0 && number < 100) {
            // Run a for loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of the number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number is not a positive integer less than 100");
        }
    }
}

