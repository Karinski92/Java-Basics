package BasicCourse.ConditionalStatements2.Exercises;

import java.util.Scanner;

public class OpsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        char Operator = scanner.nextLine().charAt(0);
        double result = 0;
        String oddOrEven = "";
        boolean isZero = false;
        if (Operator == '+') {
            result = N1 + N2;
            if (result % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
        } else if (Operator == '-') {
            result = N1 - N2;
            if (result % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
        } else if (Operator == '*') {
            result = N1 * N2;
            if (result % 2 == 0) {
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
        } else if (Operator == '/') {
            if (N2 == 0) {
                isZero = true;
            } else {
                result = N1 * 1.0 / N2;
            }
        } else if (Operator == '%') {
            if (N2 == 0) {
                isZero = true;
            } else {
                result = N1 % N2;
            }
        }
        if (Operator == '+' || Operator == '-' || Operator == '*') {
            System.out.printf("%d %c %d = %.0f - %s", N1, Operator, N2, result, oddOrEven);
        } else if (!isZero && Operator == '/') {
            System.out.printf("%d / %d = %.2f", N1, N2, result);
        } else if (!isZero && Operator == '%') {
            System.out.printf("%d %% %d = %.0f", N1, N2, result);
        } else if (isZero && Operator == '/' || Operator == '%') {
            System.out.printf("Cannot divide %d by zero", N1);
        }
    }
}
