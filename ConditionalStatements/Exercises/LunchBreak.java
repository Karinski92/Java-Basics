package BasicCourse.ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String SeriesName = scanner.nextLine();
        int SeriesLength = Integer.parseInt(scanner.nextLine());
        int RestLength = Integer.parseInt(scanner.nextLine());
        double LunchTime = RestLength/8.0;
        double RelaxTime = RestLength/4.0;
        double RemainingTime = RestLength-LunchTime-RelaxTime;
        double diff=Math.abs(RemainingTime-SeriesLength);
        if (RemainingTime>=SeriesLength) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",SeriesName,Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", SeriesName,Math.ceil(diff));
        }
    }
}
