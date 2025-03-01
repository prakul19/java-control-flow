class RocketLaunchCountdown {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Use the while loop to count down to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        // Print the final message
        System.out.println("go!");
    }
}

