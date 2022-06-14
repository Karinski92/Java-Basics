package BasicCourse.NestedLoops.Exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Prime = 0;
        int NonPrime = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int Number = Integer.parseInt(input);
            if (Number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int Count = 0;
            for (int i = 1; i <= Number ; i++) {
                if (Number % i == 0) {
                    Count ++;
                }

            }
            if (Count == 2) {
                Prime = Prime + Number;
            } else {
                NonPrime = NonPrime + Number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%nSum of all non prime numbers is: %d", Prime, NonPrime);
    }
}
