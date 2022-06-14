package BasicCourse.ConditionalStatements.MoreExercises;

import java.util.Scanner;

import static java.lang.Math.floor;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int HoursNeeded = Integer.parseInt(scanner.nextLine());
        int DaysActual = Integer.parseInt(scanner.nextLine());
        int Workers = Integer.parseInt(scanner.nextLine());
        double WorkingHours = DaysActual*0.9*8.0;
        double NonWorkingHours = Workers*2*DaysActual;
        double TotalHoursP= floor(WorkingHours+NonWorkingHours);
        if (TotalHoursP>=HoursNeeded) {
            System.out.printf("Yes!%.0f hours left.", TotalHoursP-HoursNeeded);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", HoursNeeded-TotalHoursP);
        }
    }
}
