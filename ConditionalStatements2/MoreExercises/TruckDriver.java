package BasicCourse.ConditionalStatements2.MoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Season = scanner.nextLine();
        double KM = Double.parseDouble(scanner.nextLine());
        double CostPerKM = 0;
        double Salary = 0;
        if (Season.equals("Spring") || Season.equals("Autumn")) {
            if (KM<=5000) {
                CostPerKM = 0.75;
                Salary = (KM*CostPerKM*4) * 0.9;
            } else if (KM<=10000) {
                CostPerKM = 0.95;
                Salary = (KM*CostPerKM*4) * 0.9;
            } else if ( KM<= 20000) {
                CostPerKM = 1.45;
                Salary = (KM*CostPerKM*4) * 0.9;
            }
        } else if (Season.equals("Summer")) {
            if (KM<=5000) {
                CostPerKM = 0.9;
                Salary = (KM*CostPerKM*4) * 0.9;
            } else if (KM<=10000) {
                CostPerKM = 1.10;
                Salary = (KM*CostPerKM*4) * 0.9;
            } else if ( KM<= 20000) {
                CostPerKM = 1.45;
                Salary = (KM*CostPerKM*4) * 0.9;
            }
        } else if (Season.equals("Winter")) {
            if (KM<=5000) {
                CostPerKM = 1.05;
                Salary = (KM*CostPerKM*4) * 0.9;
            } else if (KM<=10000) {
                CostPerKM = 1.25;
                Salary = (KM*CostPerKM*4) * 0.9;
            } else if ( KM<= 20000) {
                CostPerKM = 1.45;
                Salary = (KM*CostPerKM*4) * 0.9;
            }
        }
        System.out.printf("%.2f", Salary);
    }
}
