package BasicCourse.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FuelType = scanner.nextLine();
        double FuelLiters = Double.parseDouble(scanner.nextLine());
        boolean IsFuel = FuelType.equals("Gasoline") || FuelType.equals("Diesel") || FuelType.equals("Gas") || FuelType.equals("gasoline") || FuelType.equals("diesel") || FuelType.equals("gas");
        if (IsFuel) {
            if (FuelLiters>=25) {
                System.out.printf("You have enough %s.",FuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!",FuelType.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }

    }
}
