package BasicCourse.ConditionalStatements.MoreExercises;

import java.util.Scanner;

import static java.lang.Math.ceil;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SqMVineyard = Integer.parseInt(scanner.nextLine());
        double GrapePerSqM = Double.parseDouble(scanner.nextLine());
        int LiterWineNeeded = Integer.parseInt(scanner.nextLine());
        int Workers = Integer.parseInt(scanner.nextLine());
        double TotGrape = SqMVineyard*GrapePerSqM;
        double Wine =TotGrape*0.40/2.50;
        if (Wine>=LiterWineNeeded) {
            double WineRemaining = ceil(Wine-LiterWineNeeded);
            double WinePerWorker = ceil(WineRemaining/Workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters. %n %.0f liters left -> %.0f liters per person.", Wine,WineRemaining,WinePerWorker);
        } else {
            double WineNeeded = Math.floor(LiterWineNeeded-Wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",WineNeeded);
        }
    }
}
