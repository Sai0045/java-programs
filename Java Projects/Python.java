public class Python{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I love Java Programming");

        int start = sb.indexOf("Java");

        if(start != -1){
            sb.replace(start, start + "Java".length(),"Python");
        }

        System.out.println(sb);
    }
}