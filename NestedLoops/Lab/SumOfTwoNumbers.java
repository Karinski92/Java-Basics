package BasicCourse.NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int n = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int MagicN = Integer.parseInt(scanner.nextLine());
        int Combos = 0;
        boolean Flag = false;
        for (int i = n; i <= y; i++) {
            for (int j = n; j <= y; j++) {
                Combos++;
                if (i + j == MagicN) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", Combos, i, j, MagicN);
                    Flag = true;
                    break;
                }
            }
            if (Flag) {
                break;
            }
        }
        if (!Flag) {
            System.out.printf("%d combinations - neither equals %d", Combos, MagicN);
        }
    }
}
