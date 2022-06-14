package BasicCourse.ForLoop.Exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int MaxNumber = Integer.MIN_VALUE;
        int Sum = 0;

        for (int i = 1; i <=n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            Sum += number;
            if (number > MaxNumber) {
                MaxNumber=number;
            }

        }
        int SumWoMax = Sum - MaxNumber;
        if (SumWoMax == MaxNumber) {
            System.out.printf("Yes%nSum = %d", SumWoMax);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(SumWoMax-MaxNumber));
        }
    }
}
