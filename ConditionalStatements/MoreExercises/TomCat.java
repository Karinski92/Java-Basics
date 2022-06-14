package BasicCourse.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = Integer.parseInt(scanner.nextLine());
        int RestDaysPlay = D * 127;
        int WorkDaysPlay = (365-D)*63;
        int TotalPlay = RestDaysPlay+WorkDaysPlay;
        if (TotalPlay<30000) {
            int RemainingMinutes = 30000 - TotalPlay;
            double HoursR = RemainingMinutes / 60;
            double MinutesR = RemainingMinutes % 60;
            System.out.printf("Tom sleeps well %n %.0f hours and %.0f minutes less for play", HoursR, MinutesR);
        } else {
            int RemainingMinutes = TotalPlay - 30000;
            double HoursR = RemainingMinutes / 60;
            double MinutesR = RemainingMinutes % 60;
            System.out.printf("Tom will run away %n %.0f hours and %.0f minutes more for play",HoursR,MinutesR);
        }
    }
}
