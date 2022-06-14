package BasicCourse.ForLoop.Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Tournaments = Integer.parseInt(scanner.nextLine());
        int InitialPoints = Integer.parseInt(scanner.nextLine());
        int TournPoints = 0;
        int Wins = 0;

        for (int i = 0; i < Tournaments; i++) {
            String TPhase = scanner.nextLine();
            switch (TPhase) {
                case "W":
                    TournPoints += 2000;
                    Wins ++;
                    break;
                case "F":
                    TournPoints += 1200;
                    break;
                case "SF":
                    TournPoints += 720;
                    break;
            }

        }
        int TotalPoints = InitialPoints + TournPoints;
        int AvgPoints = TournPoints/Tournaments;
        double TotWins = Wins*1.0/Tournaments*100;
        System.out.printf("Final points: %d%nAverage points: %d%n%.2f%%", TotalPoints, AvgPoints,TotWins);
    }
}
