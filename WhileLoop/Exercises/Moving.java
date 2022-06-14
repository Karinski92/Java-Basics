package BasicCourse.WhileLoop.Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Width = Integer.parseInt(scanner.nextLine());
        int Length = Integer.parseInt(scanner.nextLine());
        int Hight = Integer.parseInt(scanner.nextLine());
        int AvailableSpace = Width * Length * Hight;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int CurrentSpaceTaken = Integer.parseInt(input);
            AvailableSpace = AvailableSpace - CurrentSpaceTaken;
            if (AvailableSpace <= 0) {
                break;
            }
            input = scanner.nextLine();

        }
        if (AvailableSpace <= 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(AvailableSpace));
        } else {
            System.out.printf("%d Cubic meters left.", Math.abs(AvailableSpace));
        }
    }
}
