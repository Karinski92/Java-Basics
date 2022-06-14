package BasicCourse.ConditionalStatements2.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Type = scanner.nextLine();
        int Rows = Integer.parseInt(scanner.nextLine());
        int Columns = Integer.parseInt(scanner.nextLine());
        if (Type.equals("Premiere")) {
            double TotRev = Rows * Columns * 12;
            System.out.printf("%.2f leva", TotRev);
        } else if (Type.equals("Normal")) {
            double TotRev = Rows * Columns * 7.50;
            System.out.printf("%.2f leva", TotRev);
        } else if (Type.equals("Discount")) {
            double TotRev = Rows * Columns * 5;
            System.out.printf("%.2f leva", TotRev);
        }
    }
}