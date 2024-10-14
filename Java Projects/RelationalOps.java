//Write a Java method that accepts two integers and returns a string indicating 
//whether the first integer is greater than, less than, or equal to the second integer. 
//Use relational operators to perform the comparison.

public class RelationalOps{

    public static String Comparison(int num1, int num2){
        if(num1 > num2){
            return num1 + " greater than " + num2;
        }else if(num1 < num2){
            return num1 + " smaller than " + num2;
        }else{
            return num1 + " is equal to " + num2;
        }
    }

    public static void main(String[] args){
        System.out.println(Comparison(10,5));
        System.out.println(Comparison(3,7));
        System.out.println(Comparison(4,4));
    }
}