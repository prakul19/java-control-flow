class EmployeeBonus {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Take user input for salary and years of service
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0.0; // Initialize bonus amount

        // Calculate bonus if years of service > 5
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Print the bonus amount
        System.out.println("Bonus amount: " + bonus);
    }
}

