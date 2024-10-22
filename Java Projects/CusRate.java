import java.util.Scanner;

public class CusRate {
    public static void main(String[] args){
        Scanner Macenth = new Scanner(System.in);
        int rating;
        int totalRatings = 0;
        int sum = 0;

        ratingsLoop: while(true){
            System.out.println("Enter your rating (1-5), press 0 to finssh");
            rating = Macenth.nextInt();

        if(rating == 0){
            break;
        }

        if(rating < 1 || rating > 5){
            System.out.println("Please enter a valid rating between 1 and 5");
            continue;
        }

        sum += rating;
        totalRatings++;
        }

        if(totalRatings > 0){
            double averageRating = (double)sum / totalRatings;
            System.out.println("Total ratings achieved: " +totalRatings);
            System.out.printf("Average rating: %.2f\n", averageRating);
        }else{
            System.out.println("No ratings were received");
        }
        Macenth.close();
    }
}
