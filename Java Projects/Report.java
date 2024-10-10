import java.util.Scanner;

public class Report {
    public static void main(String[] args) {
        Scanner Macenth_reader = new Scanner(System.in);
        int marks;
        int maximum_marks = -1;
        
        System.out.println("Enter Marks to Compute the Highest Grade (enter -1 to stop):");
        
        while(true) {
            marks = Macenth_reader.nextInt();
            
            if(marks == -1) {
                break;
            }
            
            if(marks > maximum_marks) {
                maximum_marks = marks;
            }
        }
        
        System.out.println("The highest marks obtained are: " + maximum_marks);
        Macenth_reader.close();
    }
}

