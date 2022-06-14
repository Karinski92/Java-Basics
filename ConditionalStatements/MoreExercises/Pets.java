package BasicCourse.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Days = Integer.parseInt(scanner.nextLine());
        int KgFoodLeft = Integer.parseInt(scanner.nextLine());
        double KgPerDayDog = Double.parseDouble(scanner.nextLine());
        double KgPerDayCat = Double.parseDouble(scanner.nextLine());
        double GramPerDayTurtle = Double.parseDouble(scanner.nextLine());
        double DogFoodTotal = Days*KgPerDayDog;
        double CatFoodTotal = Days*KgPerDayCat;
        double TurtleFoodTotal = (Days*GramPerDayTurtle)/1000;
        double TotalFoodNeeded = DogFoodTotal+CatFoodTotal+TurtleFoodTotal;
        if (TotalFoodNeeded<=KgFoodLeft) {
            System.out.printf("%.0f kilos of food left.", Math.floor(KgFoodLeft-TotalFoodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(TotalFoodNeeded-KgFoodLeft));
        }
    }
}
