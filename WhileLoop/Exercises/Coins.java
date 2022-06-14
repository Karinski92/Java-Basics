package BasicCourse.WhileLoop.Exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Change = Double.parseDouble(scanner.nextLine());
        double Coins = Change*100;

        int CoinCount =0;

        while (Coins > 0) {
            Coins = Math.round(Coins);
            if (Coins>=200) {
                Coins = Coins - 200;
                CoinCount++;
            } else if (Coins>=100) {
                Coins = Coins - 100;
                CoinCount ++;
            } else if (Coins>=50) {
                Coins = Coins - 50;
                CoinCount ++;
            } else if (Coins >= 20) {
                Coins = Coins - 20;
                CoinCount ++;
            }else if (Coins >= 10) {
                Coins = Coins - 10;
                CoinCount++;
            } else if (Coins >= 5) {
                Coins = Coins - 5;
                CoinCount++;
            }else if (Coins >= 2) {
                Coins = Coins - 2;
                CoinCount++;
            }else if (Coins >= 1) {
                Coins = Coins - 1;
                CoinCount++;
            } else {
                break;
            }

        }
        System.out.println(CoinCount);
    }
}
