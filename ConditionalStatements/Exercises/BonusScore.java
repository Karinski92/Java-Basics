package BasicCourse.ConditionalStatements.Exercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = Integer.parseInt(scanner.nextLine());
        double Bonus = 0;
        if (Number <= 100) {
            Bonus = 5;
        } else if (Number > 1000) {
            Bonus = Number*0.1;
        } else {
            Bonus = Number*0.2;
        }
        if (Number % 2 ==0) {
            Bonus = Bonus + 1;
        } else if (Number % 10 == 5) {
            Bonus = Bonus + 2;
        }
        System.out.println(Bonus);
        System.out.println(Number+Bonus);
    }
}
