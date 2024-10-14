//Create a program that takes two integers as input from the user and performs 
//all basic arithmetic operations (addition, subtraction, multiplication, division, 
//and modulus). Display the results for each operation.

public class ArithmeticOps{
    public static void main(String[] args){
        System.out.println("Arithmatic Operations for given values: ");
        int x = 5;
        int y = 6;
        System.out.println("The addition operator used in given numbers: "+x+" and "+y+" = "+(x+y));
        System.out.println("The subtraction operator used in given numbers: "+x+" and "+y+" = "+(x-y));
        System.out.println("The multiplication operator used in given numbers: "+x+" and "+y+" = "+(x*y));
        System.out.println("The division operator used in given numbers: "+x+" and "+y+" = "+(x/y));
        System.out.println("The modulus operator used in given numbers: "+x+" and "+y+"= "+(x%y));
    }
}