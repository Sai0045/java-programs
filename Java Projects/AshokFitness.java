import java.util.Scanner;

public class AshokFitness {
    public static void main(String[] args) {
        Scanner Macenth = new Scanner(System.in);
        int totalSteps = 0;
        final int DAYS_IN_WEEK = 7;
        int[] dailySteps = new int[DAYS_IN_WEEK];

        System.out.println("Log your daily steps for the week:");
        for (int day = 0; day < DAYS_IN_WEEK; day++) {
            System.out.print("Enter steps for day " + (day + 1) + ": ");
            dailySteps[day] = Macenth.nextInt();
            totalSteps += dailySteps[day];
        }

        double averageSteps = (double) totalSteps / DAYS_IN_WEEK;

        System.out.println("\nTotal steps taken in the week: " + totalSteps);
        System.out.printf("Average steps per day: %.2f\n", averageSteps);

        Macenth.close();
    }
}
