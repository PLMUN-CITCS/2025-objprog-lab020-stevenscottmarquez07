import java.util.Scanner;

public class MenuDrivenProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        // Loop until the user chooses to exit
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            
            // Validate user input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 3.");
                scanner.nextLine(); // Consume invalid input
                continue;
            }
            
            // Handle user choice
            if (!handleMenuChoice(choice, scanner)) {
                break;
            }
        }
        
        scanner.close();
    }

    // Method to display the menu options
    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle the user's menu choice
    private static boolean handleMenuChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd(scanner);
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                return false; // Exit the loop
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
        }
        return true; // Continue the loop
    }

    // Method to greet the user
    private static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if a number is even or odd
    private static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.nextLine(); // Consume invalid input
        }
    }
}
