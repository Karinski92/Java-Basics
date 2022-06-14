package BasicCourse.ConditionalStatements2.Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Budget = Double.parseDouble(scanner.nextLine());
        String Season = scanner.nextLine();
        String Destination = "";
        String Type = "";
        double Cost = 0;
        if (Budget <= 100) {
            Destination = "Bulgaria";
            if (Season.equals("summer")) {
                Type = "Camp";
                Cost = Budget*0.3;
            } else if (Season.equals("winter")) {
                Type = "Hotel";
                Cost = Budget*0.7;
            }
        }else if (Budget<=1000.00) {
            Destination = "Balkans";
            if (Season.equals("summer")) {
                Type = "Camp";
                Cost = Budget*0.4;
            } else if (Season.equals("winter")) {
                Type = "Hotel";
                Cost = Budget*0.8;
            }
        }else if (Budget>1000) {
            Destination = "Europe";
            Type = "Hotel";
            Cost = Budget * 0.9;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", Destination,Type, Cost);
        }
    }

