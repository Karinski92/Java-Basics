package BasicCourse.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String TimeOfDay = scanner.nextLine();
        if (TimeOfDay.equals("day")) {
            double PriceWithTaxi = 0.70+N*0.79;
            double PriceWithBus = N*0.09;
            double PriceWithTrain = N*0.06;
            if (N<20) {
                System.out.printf("%.2f",PriceWithTaxi);
            } else if (N>=20 && N<100) {
                System.out.printf("%.2f",PriceWithBus);
            } else {
                System.out.printf("%.2f",PriceWithTrain);
            }
        }
        if (TimeOfDay.equals("night")) {
            double PriceWithTaxi = 0.70+N*0.9;
            double PriceWithBus = N*0.09;
            double PriceWithTrain = N*0.06;
            if (N<20) {
                System.out.printf("%.2f",PriceWithTaxi);
            } else if (N>=20 && N<100) {
                System.out.printf("%.2f",PriceWithBus);
            } else {
                System.out.printf("%.2f",PriceWithTrain);
            }
        }

    }
}
