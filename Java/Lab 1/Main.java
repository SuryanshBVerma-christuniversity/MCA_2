import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the SB's Supers!\n");
        System.out.println("Please enter your customer ID and name:");

        System.out.print("Customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();

        Customer customer = new Customer(id, name);

        int choice;
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Add an item to the cart");
            System.out.println("2. Add multiple items to the cart");
            System.out.println("3. Display cart");
            System.out.println("4. Display customer details");
            System.out.println("5. Update customer details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name to add: ");
                    scanner.nextLine();  // Consume the newline character
                    String item = scanner.nextLine();
                    customer.addItem(item);
                    System.out.println(item + " has been added to the cart.");
                    break;

                case 2:
                    System.out.print("Enter multiple items separated by commas: ");
                    scanner.nextLine();  // Consume the newline character
                    String[] items = scanner.nextLine().split(",");
                    customer.addItem(items);
                    System.out.println("Items have been added to the cart.");
                    break;

                case 3:
                    customer.displayCart();
                    break;

                case 4:
                    customer.displayCustomerDetails();
                    break;

                case 5:
                    System.out.print("Enter new customer ID: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    customer.updateCustomerDetails(newId, newName);
                    System.out.println("Customer details updated.");
                    break;

                case 6:
                    System.out.println("\nThank you visiting SB's!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
