class NumberCheck {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Get integer input from the user
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

