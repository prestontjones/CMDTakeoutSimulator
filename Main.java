import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get customer name
        System.out.println("Welcome to the Take-Out Simulator!");
        System.out.print("Please enter your name: ");
        String customerName = input.nextLine();

        // Step 2: Get customer starting money
        int money = 0;
        boolean validMoney = false;
        while (!validMoney) {
            System.out.print("Please enter the amount of starting money: ");
            if (input.hasNextInt()) {
                money = input.nextInt();
                if (money > 0) {
                    validMoney = true;
                } else {
                    System.out.println("The amount of money should be a positive number. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer amount.");
                input.next(); // Consume the invalid input
            }
        }

        // Step 3: Instantiate a Customer object
        Customer customer = new Customer(customerName, money);

        // Step 4: Create a TakeOutSimulator instance (Assuming you have a FoodMenu object ready)
        FoodMenu menu = new FoodMenu(); // You will need to instantiate a FoodMenu object with your items
        TakeOutSimulator takeOutSimulator = new TakeOutSimulator(customer, menu, input);

        // Step 5: Start the simulation
        takeOutSimulator.startTakeOutSimulator();

        // End of simulation
        System.out.println("Thank you for using the Take-Out Simulator! Goodbye!");
        input.close();
    }
}
