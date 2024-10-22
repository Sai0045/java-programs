public class AvgArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        int sum = 0;
        int count = numbers.length;
        
        
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        
        double average = (double) sum / count;
        System.out.println("The average is: " + average);
    }
}