class OddEvenNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number > 0) {
            // Iterate from 1 to the number
            for (int i = 1; i <= number; i++) {
                // Check if the number is odd or even and print
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}

