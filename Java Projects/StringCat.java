public class StringCat{
    public static void main(String[] args) {
        
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("World");

        sb1.append(" ").append(sb2);
        
        System.out.println(sb1);
    }
}