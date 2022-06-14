package BasicCourse.ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int stat = Integer.parseInt(scanner.nextLine());
        double CostumeCost = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double TCC = 0;
        if (stat>150) {
            TCC=stat*CostumeCost*0.9;
        } else {
            TCC=stat*CostumeCost;
        }
        double TotCost = TCC+decor;
        double Remaining = 0;
        if (TotCost>budget) {
            Remaining=TotCost-budget;
            System.out.printf("Not enough money!" + "%n" + "Wingard needs " + "%.2f" + " leva more.", Remaining);
        } else {
            Remaining=budget-TotCost;
            System.out.printf("Action!" + "%n" + "Wingard starts filming with " + "%.2f" + " leva left.", Remaining);
        }
    }
}
