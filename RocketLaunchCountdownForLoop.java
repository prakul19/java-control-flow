class RocketLaunchCountdownForLoop {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Use the for-loop to count down to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Print the final message
        System.out.println("go!");
    }
}

