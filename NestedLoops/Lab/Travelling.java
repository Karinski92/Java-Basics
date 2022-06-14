package BasicCourse.NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Destination = scanner.nextLine();
        while (!Destination.equals("End")) {
            Double Budget = Double.parseDouble(scanner.nextLine());
            int Savings = 0;
            while (Savings < Budget) {
                double SumSavings = Double.parseDouble(scanner.nextLine());
                Savings += SumSavings;
            }
            System.out.printf("Going to %s!%n", Destination);
            Destination = scanner.nextLine();
            }
        }
    }

