//Implement a program that takes an integer input and uses left and right shift operators 
//to demonstrate how they change the value of the integer. Explain the results of each operation.

public class ShiftOps{
    public static void main(String[] args){
        int x = 5;
        System.out.println("Here we take the value of x as: "+x);
        
        int Left = x << 1;
        System.out.println("After left shift by 1, we get value of x as "+Left);
        
        int Right = x >> 1;
        System.out.println("After right shift by 1, we get value of x as "+Right);
        
        int LeftTwo = x << 2;
        System.out.println("After left shift by 2, we get value of x as "+LeftTwo);
        
        int RightTwo = x >> 2;
        System.out.println("After right shift by 2, we get value of x as "+RightTwo);
        
    }
}