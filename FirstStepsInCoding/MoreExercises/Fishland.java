package BasicCourse.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PriceMack = Double.parseDouble(scanner.nextLine());
        double PriceToy = Double.parseDouble(scanner.nextLine());
        double KgBon = Double.parseDouble(scanner.nextLine());
        double KgHM = Double.parseDouble(scanner.nextLine());
        int KgMuss = Integer.parseInt(scanner.nextLine());
        double PriceBon = PriceMack*1.6;
        double TCBon = KgBon*PriceBon;
        double PriceHM = PriceToy*1.8;
        double TCHM = PriceHM*KgHM;
        double TCMuss = KgMuss*7.50;
        double TC = TCBon+TCHM+TCMuss;
        System.out.printf("%.2f", TC);
    }
}
