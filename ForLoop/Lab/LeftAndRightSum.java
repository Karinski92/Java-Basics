package BasicCourse.ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int LeftSum =0;

        for (int i = 1; i <=n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            LeftSum += number;

        }
        int RightSum =0;
        for (int i = 1; i <=n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            RightSum += number;

        }

        if (LeftSum==RightSum) {
            System.out.printf("Yes, sum = %d", LeftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(LeftSum-RightSum));
        }

    }
}
