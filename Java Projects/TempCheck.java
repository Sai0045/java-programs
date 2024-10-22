import java.util.Scanner;

public class TempCheck {
    public static void main(String[] args) {
        Scanner Macenth = new Scanner(System.in);

        System.out.println("Enter the value of temperature in Celcius");
        int temperature = Macenth.nextInt();

        if(temperature <= 15){
            System.out.println("It is Cold");
        }
        else if(temperature >= 15){
            System.out.println("It is Warm");
        }
        else{
            System.out.println("It is Hot.");
        }
        Macenth.close();
    }
}