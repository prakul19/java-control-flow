class MultiplicationTable {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find and print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

