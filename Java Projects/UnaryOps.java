//Write a Java program that uses unary operators to increment and decrement a variable. 
//Show how these operations affect the variable’s value before and after printing it.

public class UnaryOps{
    public static void main(String[] args){
        int x = 5;
        int y = ++x;
        int z = --x;
        System.out.println("We have taken the value : "+x);
        System.out.println("Increment of x by 1 is "+(y));
        System.out.println("Decrement of x by 1 is "+(z));
        
    }
}