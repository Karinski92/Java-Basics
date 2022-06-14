package BasicCourse.PreparationExams.Exam;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FanName = scanner.nextLine();
        double Budget = Double.parseDouble(scanner.nextLine());
        int BeerBottles = Integer.parseInt(scanner.nextLine());
        int ChipsPacks = Integer.parseInt(scanner.nextLine());
        double BeerCost = 1.20 * BeerBottles;
        double ChipsCost = BeerCost * 0.45 * ChipsPacks;
        ChipsCost = Math.ceil(ChipsCost);
        double TC = BeerCost + ChipsCost;
        double Diff = Math.abs(Budget - TC);
        if (Budget >= TC) {
            System.out.printf("%s bought a snack and has %.2f leva left.", FanName, Diff);
        } else {
            System.out.printf("%s needs %.2f more leva!", FanName, Diff);
        }
    }
}
