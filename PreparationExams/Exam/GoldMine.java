package BasicCourse.PreparationExams.Exam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Locations = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < Locations; i++) {

            double ExpOutput = Double.parseDouble(scanner.nextLine());
            int DaysOnLocation = Integer.parseInt(scanner.nextLine());

            double TotalGoldLocation = 0;
            double AvgOutput = 0;

            for (int j = 0; j < DaysOnLocation; j++) {
                double OutputPerDay = Double.parseDouble(scanner.nextLine());
                TotalGoldLocation += OutputPerDay;
                AvgOutput = TotalGoldLocation / DaysOnLocation;
            }

            if (AvgOutput >= ExpOutput) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", AvgOutput);
            } else {
                System.out.printf("You need %.2f gold.%n", ExpOutput - AvgOutput);
            }


        }
    }
}
