import java.util.Scanner;

public class UntilNega {
    public static void main(String[] args) {
        Scanner Macenth = new Scanner(System.in);
        int number;
        
        // Correct placement of the do-while loop
        do {
            System.out.println("Enter a number (negative number to quit): ");
            number = Macenth.nextInt();
            
            if (number >= 0) {
                System.out.println("You entered: " + number);
            }
        } while (number >= 0);  // The while condition should be outside the loop
        
        System.out.println("You entered a negative number. Program terminated.");
        
        Macenth.close();
    }
}