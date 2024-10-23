public class WorldDeleter{
    public static void main(String[] args){
        
        StringBuffer sb = new StringBuffer("Hello World");

        sb.delete(sb.indexOf("World"),sb.indexOf("World") + "World".length());
        System.out.println(sb);
    }
}