package BasicCourse.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FuelType = scanner.nextLine().toLowerCase();
        double FuelLiters = Double.parseDouble(scanner.nextLine());
        String ClubCard = scanner.nextLine().toLowerCase();
        if (FuelLiters>25) {
            if (FuelType.equals("gasoline") && ClubCard.equals("yes")) {
                double TC = FuelLiters*(2.22-0.18)*0.9;
                System.out.printf("%.2f lv.", TC);
            } else if (FuelType.equals("gasoline") && ClubCard.equals("no")) {
                double TC = (FuelLiters*2.22)*0.9;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("diesel") && ClubCard.equals("yes")) {
                double TC = (FuelLiters * (2.33 - 0.12)) * 0.9;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("diesel") && ClubCard.equals("no")) {
                double TC = (FuelLiters * 2.33) * 0.9;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("gas") && ClubCard.equals("yes")) {
                double TC = (FuelLiters * (0.93 - 0.08)) * 0.9;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("gas") && ClubCard.equals("no")) {
                double TC = (FuelLiters * 0.93) * 0.9;
                System.out.printf("%.2f lv.", TC);
            }
        } else if (FuelLiters<20) {
            if (FuelType.equals("gasoline") && ClubCard.equals("yes")) {
                double TC = FuelLiters*(2.22-0.18);
                System.out.printf("%.2f lv.", TC);
            } else if (FuelType.equals("gasoline") && ClubCard.equals("no")) {
                double TC = FuelLiters*2.22;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("diesel") && ClubCard.equals("yes")) {
                double TC = FuelLiters * (2.33 - 0.12);
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("diesel") && ClubCard.equals("no")) {
                double TC = FuelLiters * 2.33;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("gas") && ClubCard.equals("yes")) {
                double TC = FuelLiters * (0.93 - 0.08);
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("gas") && ClubCard.equals("no")) {
                double TC = FuelLiters * 0.93;
                System.out.printf("%.2f lv.", TC);
            }
        } else {
            if (FuelType.equals("gasoline") && ClubCard.equals("yes")) {
                double TC = FuelLiters*(2.22-0.18)*0.92;
                System.out.printf("%.2f lv.", TC);
            } else if (FuelType.equals("gasoline") && ClubCard.equals("no")) {
                double TC = (FuelLiters*2.22)*0.92;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("diesel") && ClubCard.equals("yes")) {
                double TC = (FuelLiters * (2.33 - 0.12)) * 0.92;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("diesel") && ClubCard.equals("no")) {
                double TC = (FuelLiters * 2.33) * 0.92;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("gas") && ClubCard.equals("yes")) {
                double TC = (FuelLiters * (0.93 - 0.08)) * 0.92;
                System.out.printf("%.2f lv.", TC);
            }else if (FuelType.equals("gas") && ClubCard.equals("no")) {
                double TC = (FuelLiters * 0.93) * 0.92;
                System.out.printf("%.2f lv.", TC);
            }
        }

    }
}