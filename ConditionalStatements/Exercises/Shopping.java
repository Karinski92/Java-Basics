package BasicCourse.ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int VidCard = Integer.parseInt(scanner.nextLine());
        int Processors = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());
        double CostVC = VidCard*250;
        double CostProc = CostVC*0.35*Processors;
        double CostRAM = CostVC*0.1*RAM;
        double TC = CostProc+CostRAM+CostVC;
        if (VidCard>Processors) {
            TC = TC*0.85;
        }
        if (budget>=TC) {
            System.out.printf("You have %.2f leva left!", budget-TC);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", TC-budget);
        }

    }
}
