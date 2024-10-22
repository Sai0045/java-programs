import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner Macenth = new Scanner(System.in);
        List<String> itemNames = new ArrayList<>();
        List<Double> itemPrices = new ArrayList<>();
        String input;

        System.out.println("Welcome to the Shopping Cart Application!");
        System.out.println("Enter item names and prices. Type 'checkout' when you're ready to finish.");

        while (true) {
            System.out.print("Enter item name (or 'checkout' to finish): ");
            input = Macenth.nextLine();

            if (input.equalsIgnoreCase("checkout")) {
                break;
            }

            System.out.print("Enter price for " + input + ": ");
            double price;
            try {
                price = Double.parseDouble(Macenth.nextLine());
                itemNames.add(input);
                itemPrices.add(price);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid price.");
            }
        }

        double totalAmount = 0.0;
        for (double price : itemPrices) {
            totalAmount += price;
        }

        System.out.println("\nItems purchased:");
        for (int i = 0; i < itemNames.size(); i++) {
            System.out.printf("%s: $%.2f\n", itemNames.get(i), itemPrices.get(i));
        }
        System.out.printf("Total amount due: $%.2f\n", totalAmount);

        Macenth.close();
    }
}
