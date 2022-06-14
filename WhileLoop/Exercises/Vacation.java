package BasicCourse.WhileLoop.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double NeededMoney = Double.parseDouble(scanner.nextLine());
        double CurrentMoney = Double.parseDouble(scanner.nextLine());
        double FinalAmount = CurrentMoney;

        int Days = 0;
        int Spending = 0;
        boolean Fail = false;

        while (FinalAmount < NeededMoney) {
            if (Spending == 5) {
                Fail = true;
                break;
            }
            String Action = scanner.nextLine();
            double Amount = Double.parseDouble(scanner.nextLine());
            Days ++;

            if (Action.equals("save")) {
                Spending = 0;
                FinalAmount = FinalAmount + Amount;
            } else {
                Spending ++;
                FinalAmount = FinalAmount - Amount;
                if (FinalAmount < 0){
                    FinalAmount = 0;
                }
            }

        }
        if (Fail) {
            System.out.printf("You can't save the money.%n%d", Days);
        } else {
            System.out.printf("You saved the money for %d days.", Days);
        }


    }
}
