package BasicCourse.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double P1Fill = P1*H;
        double P2Fill = P2*H;
        double PoolFilled = P1Fill+P2Fill;
        double P1Percent = P1Fill/PoolFilled*100;
        double P2Percent = P2Fill/PoolFilled*100;
        double PoolPercent = PoolFilled/V*100;
        if (PoolFilled>V) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",
                    H,
                    PoolFilled-V);
        } else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", PoolPercent, P1Percent, P2Percent);
        }

    }

}
