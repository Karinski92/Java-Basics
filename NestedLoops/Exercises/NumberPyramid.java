package BasicCourse.NestedLoops.Exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int CurrentNum = 1;
        boolean Bigger = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                if (CurrentNum > n) {
                    Bigger = true;
                    break;
                }
                System.out.printf("%d ", CurrentNum);
                CurrentNum++;
            }
            if (Bigger) {
                break;
            }
            System.out.println();
        }
    }
}