package BasicCourse.ConditionalStatements2.MoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int JuniorRacers = Integer.parseInt(scanner.nextLine());
        int SeniorRacers = Integer.parseInt(scanner.nextLine());
        String Type = scanner.nextLine();
        double JuniorTax = 0;
        double SeniorTax = 0;
        switch (Type) {
            case "trail":
                JuniorTax = 5.5;
                SeniorTax = 7;
                break;
            case "cross-country":
                if ((JuniorRacers+SeniorRacers) >= 50) {
                    JuniorTax = 8*0.75;
                    SeniorTax = 9.50*0.75;
                } else {
                    JuniorTax = 8;
                    SeniorTax = 9.50;
                }
                break;
            case "downhill":
                JuniorTax = 12.25;
                SeniorTax = 13.75;
                break;
            case "road":
                JuniorTax = 20;
                SeniorTax = 21.5;
                break;
        }
        double MoneyTotal = JuniorRacers*JuniorTax + SeniorRacers*SeniorTax;
        double Expenses = MoneyTotal*0.05;
        double Remaining = MoneyTotal-Expenses;
        System.out.printf("%.2f", Remaining);
    }
}
