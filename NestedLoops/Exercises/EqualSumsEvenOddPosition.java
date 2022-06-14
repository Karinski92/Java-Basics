package BasicCourse.NestedLoops.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        for (int i = N1; i <= N2 ; i++) {
            String CurrentNumber = "" + i;
            int Odd = 0;
            int Even = 0;
            for (int j = 0; j < CurrentNumber.length(); j++) {
                int Digit = Integer.parseInt("" + CurrentNumber.charAt(j));
                if (j % 2 == 0) {
                    Even += Digit;
                } else {
                    Odd += Digit;
                }
                
            }
            if (Odd == Even) {
                System.out.printf("%d ", i);
            }
        }
    }
}
