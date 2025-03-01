import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for month and day
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the day: ");
        int day = input.nextInt();

        // Check if the date is within the spring season
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month == 4) || (month == 5)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

