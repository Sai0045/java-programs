import java.util.Scanner;

public class WhileFlight {
    public static void main(String[] args) {
        Scanner Macenth = new Scanner(System.in);
        int flightChoice = -1;
        
        while (flightChoice <= 0) {
            System.out.print("Enter a valid flight number (must be a positive integer): ");
            
            if (Macenth.hasNextInt()) {
                flightChoice = Macenth.nextInt();
                if (flightChoice > 0) {
                    System.out.println("You have selected flight number: " + flightChoice);
                } else {
                    System.out.println("Invalid flight number. Please try again.");
                }
            } else {
                System.out.println("That's not a valid number. Please try again.");
                Macenth.next();
            }
        }
        
        Macenth.close();
    }
}