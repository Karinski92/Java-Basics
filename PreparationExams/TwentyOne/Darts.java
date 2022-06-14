package BasicCourse.PreparationExams.TwentyOne;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String PlayerName = scanner.nextLine();
        String input = scanner.nextLine();
        int TotPoints = 0;
        int PointsLeft = 301;
        int SuccessfulShots = 0;
        int FailedShots =0;

        while (!input.equals("Retire")) {
            String Sector = input;
            int Points = Integer.parseInt(scanner.nextLine());
            if (TotPoints > PointsLeft) {
                FailedShots ++;
                continue;
            } else if (TotPoints < PointsLeft){
                SuccessfulShots ++;
            } else if (TotPoints == PointsLeft) {
                SuccessfulShots ++;
                break;
            }
            switch (Sector) {
                case "Triple":
                    TotPoints += Points * 3;
                    PointsLeft = PointsLeft - TotPoints;
                    break;
                case "Double":
                    TotPoints += Points * 2;
                    PointsLeft = PointsLeft - TotPoints;
                    break;
                case "Single":
                    TotPoints += Points;
                    PointsLeft = PointsLeft - TotPoints;
                    break;
            }

            input = scanner.nextLine();
            Points = scanner.nextInt();
        }
        System.out.println(TotPoints);
        if (input.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", PlayerName, FailedShots);
        } else {
            System.out.printf("%s won the leg with %d shots.", PlayerName, SuccessfulShots);

        }

    }
}
