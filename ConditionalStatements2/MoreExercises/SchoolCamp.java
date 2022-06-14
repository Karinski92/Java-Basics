package BasicCourse.ConditionalStatements2.MoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Season = scanner.nextLine();
        String Group = scanner.nextLine();
        int Students = Integer.parseInt(scanner.nextLine());
        int Nights = Integer.parseInt(scanner.nextLine());
        double CostPerStudent = 0;
        double TC = 0;
        String Sport = "";
        switch (Season) {
            case "Spring":
                if (Group.equals("girls")) {
                    CostPerStudent = 7.20;
                    Sport = "Athletics";
                } else if (Group.equals("mixed")) {
                    CostPerStudent = 9.50;
                    Sport = "Cycling";
                } else if (Group.equals("boys")) {
                    CostPerStudent = 7.20;
                    Sport = "Tennis";
                }
                break;
            case "Summer":
                if (Group.equals("girls")) {
                    CostPerStudent = 15;
                    Sport = "Volleyball";
                } else if (Group.equals("mixed")) {
                    CostPerStudent = 20;
                    Sport = "Swimming";
                } else if (Group.equals("boys")) {
                    CostPerStudent = 15;
                    Sport = "Football";
                }
                break;
            case "Winter":
                if (Group.equals("girls")) {
                    CostPerStudent = 9.6;
                    Sport = "Gymnastics";
                } else if (Group.equals("mixed")) {
                    CostPerStudent = 10;
                    Sport = "Ski";
                } else if (Group.equals("boys")) {
                    CostPerStudent = 9.6;
                    Sport = "Judo";
                }
                break;
        }
        if (Students>=50) {
            TC = Students*CostPerStudent*Nights*0.5;
        } else if (Students>=20) {
            TC = Students*CostPerStudent*Nights*0.85;
        } else if (Students>=10) {
            TC = Students*CostPerStudent*Nights*0.95;
        } else {
            TC = Students*CostPerStudent*Nights;
        }
        System.out.printf("%s %.2f lv.", Sport, TC);
    }
}
