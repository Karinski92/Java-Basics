package BasicCourse.ConditionalStatements2.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String City = scanner.nextLine();
        double Sales = Double.parseDouble(scanner.nextLine());
        if (City.equals("Sofia")) {
            if (Sales>=0 && Sales<=500) {
                System.out.printf("%.2f", 0.05*Sales);
            } else if (Sales>500 && Sales<=1000) {
                System.out.printf("%.2f", 0.07*Sales);
            } else if (Sales>1000 && Sales<=10000) {
                System.out.printf("%.2f", 0.08*Sales);
            } else if (Sales>10000) {
                System.out.printf("%.2f", 0.12*Sales);
            } else {
                System.out.println("error");
            }
        } else if (City.equals("Varna")) {
            if (Sales >= 0 && Sales <= 500) {
                System.out.printf("%.2f", 0.045 * Sales);
            } else if (Sales > 500 && Sales <= 1000) {
                System.out.printf("%.2f", 0.075 * Sales);
            } else if (Sales > 1000 && Sales <= 10000) {
                System.out.printf("%.2f", 0.1 * Sales);
            } else if (Sales > 10000) {
                System.out.printf("%.2f", 0.13 * Sales);
            } else {
                System.out.println("error");
            }
        } else if (City.equals("Plovdiv")) {
            if (Sales >= 0 && Sales <= 500) {
                System.out.printf("%.2f", 0.055 * Sales);
            } else if (Sales > 500 && Sales <= 1000) {
                System.out.printf("%.2f", 0.08 * Sales);
            } else if (Sales > 1000 && Sales <= 10000) {
                System.out.printf("%.2f", 0.12 * Sales);
            } else if (Sales > 10000) {
                System.out.printf("%.2f",0.145 * Sales);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
