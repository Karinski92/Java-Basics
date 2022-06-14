package BasicCourse.ConditionalStatements.Exercises;

import java.util.Scanner;

public class Toys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VacCost = Double.parseDouble(scanner.nextLine());
        int Puzzle = Integer.parseInt(scanner.nextLine());
        int Dolls = Integer.parseInt(scanner.nextLine());
        int Bears = Integer.parseInt(scanner.nextLine());
        int Minions = Integer.parseInt(scanner.nextLine());
        int Trucks = Integer.parseInt(scanner.nextLine());
        double TotRev = Puzzle*2.60 + Dolls*3.00 + Bears*4.10 + Minions*8.20 + Trucks*2.00;
        int TotToys = Puzzle+Dolls+Bears+Minions+Trucks;
        double Remaining = 0;
        if (TotToys>=50) {
            TotRev = (TotRev - TotRev*0.25)*0.9;
        } else {
            TotRev = TotRev*0.9;
        }
        if (TotRev>=VacCost) {
            Remaining = TotRev-VacCost;
            System.out.printf("Yes! " + "%.2f" + " lv left.", Remaining);
        } else {
            Remaining = VacCost - TotRev;
            System.out.printf("Not enough money! " + "%.2f" + " lv needed.", Remaining);
        }
    }
}
