package BasicCourse.ConditionalStatements2.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Month = scanner.nextLine();
        int Nights = Integer.parseInt(scanner.nextLine());
        double StudioCost = 0;
        double AppCost = 0;
        if (Month.equals("May") || Month.equals("October")) {
            if (Nights > 7 && Nights <= 14) {
                StudioCost = 50 * 0.95;
                AppCost = 65;
            } else if (Nights > 14) {
                StudioCost = 50 * 0.7;
                AppCost = 65 * 0.9;
            } else {
                StudioCost = 50;
                AppCost = 65;
            }
        } else if (Month.equals("June") || Month.equals("September")) {
            if (Nights > 14) {
                StudioCost=75.20*0.8;
                AppCost = 68.70*0.9;
            } else {
                StudioCost = 75.20;
                AppCost = 68.70;
            }

        } else if (Month.equals("July") || Month.equals("August")) {
            if (Nights>14) {
                StudioCost = 76;
                AppCost = 77*0.9;
            } else {
                StudioCost = 76;
                AppCost = 77;
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", AppCost*Nights, StudioCost*Nights);
    }
}
