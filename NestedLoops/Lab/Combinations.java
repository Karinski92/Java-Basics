package BasicCourse.NestedLoops.Lab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int Combos = 0;
        for (int x = 0; x <= n; x++) {
            for (int y = 0; y <= n; y++) {
                for (int z = 0; z <= n; z++) {
                    if (x+y+z == n) {
                        Combos++;
                    }
                }
            }
        }
        System.out.println(Combos);
    }
}
