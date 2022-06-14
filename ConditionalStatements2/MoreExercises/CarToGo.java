package BasicCourse.ConditionalStatements2.MoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Budget = Double.parseDouble(scanner.nextLine());
        String Season = scanner.nextLine();
        String Class = "";
        String Type = "";
        double Cost = 0;
        switch (Season) {
            case "Summer":
                if (Budget<=100) {
                    Class = "Economy class";
                    Type="Cabrio";
                    Cost = Budget*0.35;
                } else if (Budget<=500) {
                    Class = "Compact class";
                    Type = "Cabrio";
                    Cost = Budget*0.45;
                } else if (Budget>500) {
                    Class = "Luxury class";
                    Type = "Jeep";
                    Cost = Budget*0.9;
                }
                break;
            case "Winter":
                if (Budget<=100) {
                    Class = "Economy class";
                    Type = "Jeep";
                    Cost = Budget*0.65;
                } else if (Budget<=500) {
                    Class = "Compact class";
                    Type = "Jeep";
                    Cost = Budget*0.8;
                } else if (Budget>500) {
                    Class = "Luxury class";
                    Type = "Jeep";
                    Cost = Budget*0.9;
                }
                break;
        }
        System.out.printf("%s%n%s - %.2f", Class, Type, Cost);
    }
}
