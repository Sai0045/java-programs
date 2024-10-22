public class SubstringDeleter {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Hello World");

        System.out.println("Original String: " + stringBuffer);

        String substring = "World";

        int startIndex = stringBuffer.indexOf(substring);
        
        if (startIndex != -1) {
            stringBuffer.delete(startIndex, startIndex + substring.length());
        }

        System.out.println("Modified String: " + stringBuffer);
    }
}
