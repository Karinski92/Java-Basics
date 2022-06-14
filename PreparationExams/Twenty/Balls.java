package BasicCourse.PreparationExams.Twenty;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Balls = Integer.parseInt(scanner.nextLine());
        int RedCount = 0;
        int OrangeCount = 0;
        int YellowCount = 0;
        int WhiteCount = 0;
        int OthersCount = 0;
        int BlackCount = 0;
        int Points = 0;

        for (int i = 1; i <= Balls; i++) {
            String Color = scanner.nextLine();

            if (Color.equals("red")) {
                RedCount ++;
                Points += 5;
            } else if (Color.equals("orange")) {
                OrangeCount ++;
                Points += 10;
            } else if (Color.equals("yellow")) {
                YellowCount ++;
                Points += 15;
            } else if (Color.equals("white")) {
                WhiteCount ++;
                Points += 20;
            } else if (Color.equals("black")) {
                BlackCount ++;
                Points /= 2;
            } else {
                OthersCount ++;
            }
        }
        System.out.printf("Total points: %d%n", Points);
        System.out.printf("Red balls: %d%n", RedCount);
        System.out.printf("Orange balls: %d%n", OrangeCount);
        System.out.printf("Yellow balls: %d%n", YellowCount);
        System.out.printf("White balls: %d%n", WhiteCount);
        System.out.printf("Other colors picked: %d%n", OthersCount);
        System.out.printf("Divides from black balls: %d", BlackCount);
    }
}
