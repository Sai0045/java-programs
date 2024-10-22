import java.util.Scanner;

public class PosNegZero{
    public static void main(String[] args) {
        try (Scanner Macenth = new Scanner(System.in)) {
            System.out.println("Type a number as input");
            int x = Macenth.nextInt();
            System.out.println("The number chosen is: "+x);
            
            if(x<=0){
                System.out.println("The number is positive");
            }
            else if(x<0){
                System.out.println("The numerb is negative");
            }
            else{
                System.out.println("The number is zero.");
            }
        }
    }
}