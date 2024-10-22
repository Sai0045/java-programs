import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner Macenth = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = Macenth.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        Macenth.close();
    }
}