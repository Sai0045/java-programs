import java.util.Scanner;

public class LogicalOps {
    public static void main(String[] args) {
        try (Scanner Macenth_Reader = new Scanner(System.in)) {
            System.out.println("Enter your Age");
            int age = Macenth_Reader.nextInt();
            
            System.out.println("Are you a citizen? (True / False)");
            boolean isCitizen = Macenth_Reader.nextBoolean();
            
            if(age >= 18 && isCitizen){
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("You are not eligible to vote");
            }
        }
    }
}
