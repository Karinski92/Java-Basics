package BasicCourse.ConditionalStatements2.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Days = Integer.parseInt(scanner.nextLine());
        String Type = scanner.nextLine();
        String Review = scanner.nextLine();
        double Price = 0;
        double MoneyTrip = 0;
        switch (Type) {
            case "room for one person":
                if(Days-1<10) {
                    Price = 18;
                } else if (Days-1<15) {
                    Price = 18;
                } else if (Days-1>15) {
                    Price = 18;
                }
                break;
            case "apartment":
                if(Days-1<10) {
                    Price = 25*0.7;
                } else if (Days-1<15) {
                    Price = 25*0.65;
                } else if (Days-1>15) {
                    Price = 25*0.5;
                }
                break;
            case "president apartment":
                if(Days-1<10) {
                    Price = 35*0.9;
                } else if (Days-1<15) {
                    Price = 35*0.85;
                } else if (Days-1>15) {
                    Price = 35*0.80;
                }
                break;
        }
        if (Review.equals("positive")) {
            MoneyTrip = ((Days-1)*Price)*1.25;
        } else if (Review.equals("negative")) {
            MoneyTrip = ((Days-1)*Price)*0.9;
        }
        System.out.printf("%.2f", MoneyTrip);
    }
}
