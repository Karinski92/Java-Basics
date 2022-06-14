package BasicCourse.ConditionalStatements2.Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Budget = Double.parseDouble(scanner.nextLine());
        String Season = scanner.nextLine();
        int Fishermen = Integer.parseInt(scanner.nextLine());
        double Price = 0.00;

        if (Season.equals("Spring")) {
            Price = 3000;
            if (Fishermen<=6) {
                Price = 3000 - (3000*0.10);
            } else if (Fishermen<=11) {
                Price = 3000 - (3000*0.15);
            } else if (Fishermen>=12)
                Price = 3000 - (3000*0.25);
        }
        if (Season.equals("Summer")) {
            Price = 4200;
            if (Fishermen<=6) {
                Price = 4200 - (4200*0.10);
            } else if (Fishermen<=11) {
                Price = 4200 - (4200*0.15);
            } else if (Fishermen>=12)
                Price = 4200 - (4200*0.25);
        }
        if (Season.equals("Autumn")) {
            Price = 4200;
            if (Fishermen<=6) {
                Price = 4200 - (4200*0.10);
            } else if (Fishermen<=11) {
                Price = 4200 - (4200*0.15);
            } else if (Fishermen>=12)
                Price = 4200 - (4200*0.25);
        }
        if (Season.equals("Winter")) {
            Price = 2600;
            if (Fishermen<=6) {
                Price = 2600 - (2600*0.10);
            } else if (Fishermen<=11) {
                Price = 2600 - (2600*0.15);
            } else if (Fishermen>=12)
                Price = 2600 - (2600*0.25);
        }
        if (Fishermen%2==0) {
            if (!Season.equals("Autumn")) Price = Price*0.95;
        }
        double Diff = Math.abs(Budget-Price);
        if (Budget>=Price) {
            System.out.printf("Yes! You have %.2f leva left.", Diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Diff);
        }

    }
}
