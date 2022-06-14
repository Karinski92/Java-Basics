package BasicCourse.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double Sides = 2 * (x * y) - 2 * (1.5 * 1.5);
        double FrontBack = 2 * (x * x) - 1.2 * 2;
        double TGP = (Sides + FrontBack) / 3.4;
        double RoofRect = 2 * (x * y);
        double RoofTriangle = 2 * (x * h / 2);
        double TRP = (RoofRect + RoofTriangle) / 4.3;
        System.out.printf("%.2f%n" + "%.2f", TGP,TRP);

    }
}
