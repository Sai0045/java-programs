import java.util.*;

public class ComplexConditionals {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        String SOne = "abc";
        String STwo = "z";

        boolean bool1 = input.contains(SOne);
        boolean bool2 = input.contains(STwo);

        if((bool1 || bool2) && false)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

        reader.close();
    }
}