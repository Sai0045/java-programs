import java.util.Scanner;

public class MonthlyExpenses {
    public static void main(String[] args) {
        Scanner Macenth = new Scanner(System.in);
        double totalExpenses = 0.0;
        String input;

        System.out.println("Enter your monthly expenses. Type 'done' when you are finished.");

        while (true) {
            System.out.print("Enter expense (or type 'done' to finish): ");
            input = Macenth.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                
                double expense = Double.parseDouble(input);
                totalExpenses += expense;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number for the expense.");
            }
        }

        System.out.printf("Total expenses for the month: $%.2f\n", totalExpenses);

        Macenth.close();
    }
}
