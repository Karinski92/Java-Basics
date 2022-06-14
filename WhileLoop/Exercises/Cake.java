package BasicCourse.WhileLoop.Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Width = Integer.parseInt(scanner.nextLine());
        int Length = Integer.parseInt(scanner.nextLine());
        int Pieces = Width*Length;
        String input = scanner.nextLine();
        int PcsCount = 0;

        while (!input.equals("STOP")) {
            int PcsTaken = Integer.parseInt(input);
            Pieces = Pieces - PcsTaken;
            if (Pieces<=0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (Pieces <=0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(Pieces));

        } else {
            System.out.printf("%d pieces are left.", Math.abs(Pieces));
        }

    }
}
