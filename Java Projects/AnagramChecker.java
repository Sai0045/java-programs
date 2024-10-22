import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner Macenth = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = Macenth.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = Macenth.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        } else {

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
            } else {
                System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
            }
        }

        Macenth.close();
    }
}
