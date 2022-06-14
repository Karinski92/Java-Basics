package BasicCourse.ConditionalStatements2.MoreExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Budget = Double.parseDouble(scanner.nextLine());
        String Season = scanner.nextLine();
        String Location = "";
        String Type = "";
        double Cost = 0;
        switch (Season) {
            case "Summer":
                Location = "Alaska";
                if (Budget<=1000) {
                    Type = "Camp";
                    Cost = Budget*0.65;
                } else if (Budget<=3000) {
                    Type = "Hut";
                    Cost = Budget*0.80;
                } else if (Budget > 3000) {
                    Type = "Hotel";
                    Cost = Budget*0.90;
                }
                break;
            case "Winter":
                Location = "Morocco";
                if (Budget<=1000) {
                    Type = "Camp";
                    Cost = Budget*0.45;
                } else if (Budget<=3000) {
                    Type = "Hut";
                    Cost = Budget*0.60;
                } else if (Budget > 3000) {
                    Type = "Hotel";
                    Cost = Budget*0.90;
                }
                break;
        }
        System.out.printf("%s - %s - %.2f", Location, Type, Cost);
    }
}
