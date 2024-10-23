public class SBInitCap {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();

        System.out.println("Initial capacity: " + sb.capacity());

        sb.append("This is a test string that is long enough to exceed the default capacity");

        System.out.println("New capacity after reappending: " + sb.capacity());
    }
}
