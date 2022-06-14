package BasicCourse.NestedLoops.Lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Floors = Integer.parseInt(scanner.nextLine());
        int Rooms = Integer.parseInt(scanner.nextLine());
        for (int i = Floors; i > 0 ; i--) {
            for (int j = 0; j < Rooms; j++) {
                if (i==Floors) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
