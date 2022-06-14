package BasicCourse.ConditionalStatements2.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Flower = scanner.nextLine();
        int NumFlowers = Integer.parseInt(scanner.nextLine());
        int Budget = Integer.parseInt(scanner.nextLine());
        double TC = 0;
        switch (Flower) {
            case "Roses":
                TC = 5*NumFlowers;
                if (NumFlowers>80) {
                    TC = TC - (TC*0.1);
                }
                break;
            case "Dahlias":
                TC = 3.8*NumFlowers;
                if (NumFlowers>90) {
                    TC = TC - (TC*0.15);
                }
                break;
            case "Tulips":
                TC = 2.8*NumFlowers;
                if (NumFlowers>80) {
                    TC = TC - (TC*0.15);
                }
                break;
            case "Narcissus":
                TC = 3*NumFlowers;
                if (NumFlowers<120) {
                    TC = TC + (TC*0.15);
                }
                break;
            case "Gladiolus":
                TC = 2.50*NumFlowers;
                if (NumFlowers<80) {
                    TC = TC + (TC*0.2);
                } break;

        }
        double diff = Math.abs(Budget - TC);
        if (Budget >= TC) {
            System.out.printf("Hey, you have a great garden with %d %s " +
                    "and %.2f leva left.", NumFlowers, Flower, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}