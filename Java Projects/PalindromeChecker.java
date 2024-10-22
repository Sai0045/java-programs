import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner Macenth = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = Macenth.nextLine();

        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        for (int i = cleanedInput.length() - 1; i >= 0; i--) {
            reversed += cleanedInput.charAt(i);
        }

        if (cleanedInput.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        Macenth.close();
    }
}