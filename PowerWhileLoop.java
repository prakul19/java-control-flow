class PowerWhileLoop {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number and power
        System.out.print("Enter a positive integer for the base: ");
        int number = input.nextInt();
        System.out.print("Enter a positive integer for the power: ");
        int power = input.nextInt();

        int result = 1; 
        int counter = 0; 

        // Compute the power using a while loop
        while (counter < power) {
            result *= number;
            counter++; 
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is " + result);
    }
}

