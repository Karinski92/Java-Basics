package BasicCourse.PreparationExams.Twenty;


import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Player = scanner.nextLine();
        boolean HatTrick = false;
        int MaxGoals = Integer.MIN_VALUE;
        String TopPlayer = "";

        while (!Player.equals("END")) {
            int Goals = Integer.parseInt(scanner.nextLine());

            if (Goals > MaxGoals) {
                MaxGoals = Goals;
                TopPlayer = Player;
            }

            if (Goals >= 3) {
                HatTrick = true;
            }

            if (Goals >= 10) {
                break;
            }
            Player = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", TopPlayer);
        if (HatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", MaxGoals);
        } else {
            System.out.printf("He has scored %d goals.", MaxGoals);
        }

    }
}

