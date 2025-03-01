class NaturalNumberSumComparison {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number >= 0) {
            // Compute sum using the formula
            int sumFormula = number * (number + 1) / 2;

            // Compute sum using while loop
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= number) {
                sumWhileLoop += i;
                i++;
            }

            // Compare the two results and print them
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhileLoop);
            System.out.println("Both computations are correct: " + (sumFormula == sumWhileLoop));
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}

