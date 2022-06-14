package BasicCourse.WhileLoop.Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Target = 10000;
        int Steps = 0;
        String input = scanner.nextLine();

        while (!input.equals("Going home")) {
            int StepsNew = Integer.parseInt(input);
            Steps = Steps + StepsNew;

            if (Steps >= Target) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            int StepsHome = Integer.parseInt(scanner.nextLine());
            Steps = Steps + StepsHome;
        }
        int Diff = Math.abs(Steps - Target);
        if (Steps >= Target) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Diff);
        } else {
            System.out.printf("%d more steps to reach goal.", Diff);
        }
    }
}
