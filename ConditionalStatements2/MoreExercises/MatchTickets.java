package BasicCourse.ConditionalStatements2.MoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Budget = Double.parseDouble(scanner.nextLine());
        String Category = scanner.nextLine();
        int PplGroup = Integer.parseInt(scanner.nextLine());
        double TravelExp = 0;
        double TicketCost =0;
        switch (Category) {
            case "VIP":
                TicketCost = PplGroup*499.99;
                if (PplGroup<=4) {
                    TravelExp = Budget*0.75;
                } else if (PplGroup<=9) {
                    TravelExp = Budget*0.65;
                } else if (PplGroup<=24) {
                    TravelExp = Budget*0.5;
                } else if (PplGroup<=49) {
                    TravelExp = Budget*0.4;
                } else {
                    TravelExp = Budget*0.25;
                }
                break;
            case "Normal":
                TicketCost = PplGroup*249.99;
                if (PplGroup<=4) {
                    TravelExp = Budget*0.75;
                } else if (PplGroup<=9) {
                    TravelExp = Budget*0.65;
                } else if (PplGroup<=24) {
                    TravelExp = Budget*0.5;
                } else if (PplGroup<=49) {
                    TravelExp = Budget*0.4;
                } else {
                    TravelExp = Budget*0.25;
                }
                break;
        }
        double TotalCost = TicketCost+TravelExp;
        if (Budget>=TotalCost) {
            System.out.printf("Yes! You have %.2f leva left.", Budget-TotalCost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", TotalCost-Budget);
        }
    }
}
