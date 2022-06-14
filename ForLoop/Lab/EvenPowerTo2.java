package BasicCourse.ForLoop.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EvenPowerTo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new DecimalFormat("0.##");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<=n; i++) {
            if (i%2==0) {
                double f = Math.pow(2,i);
                System.out.printf("%.0f%n", f);
            }
        }
    }
}
