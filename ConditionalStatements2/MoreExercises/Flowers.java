package BasicCourse.ConditionalStatements2.MoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Chris = Integer.parseInt(scanner.nextLine());
        int Roses = Integer.parseInt(scanner.nextLine());
        int Lale = Integer.parseInt(scanner.nextLine());
        String Season = scanner.nextLine();
        String Holiday = scanner.nextLine();
        double CostChris = 0;
        double CostRoses = 0;
        double CostLale = 0;
        double TC = 0;
        switch (Holiday) {
            case "Y":
                if (Season.equals("Spring") || Season.equals("Summer")) {
                    CostChris=2+(2*0.15);
                    CostRoses=4.10+(4.1*0.15);
                    CostLale = 2.50+(2.50*0.15);
                    if(Lale>=7 && Season.equals("Spring")) {
                        TC = (Chris*CostChris+Roses*CostRoses+Lale*CostLale)*0.95;
                    } else {
                        TC = (Chris*CostChris+Roses*CostRoses+Lale*CostLale);
                    }
                } else if (Season.equals("Autumn") || Season.equals("Winter")) {
                    CostChris=3.75*1.15;
                    CostLale=4.15*1.15;
                    CostRoses=4.50*1.15;
                if (Roses >= 10 && Season.equals("Winter")) {
                    TC = (Chris*CostChris+Roses*CostRoses+Lale*CostLale) * 0.9;
                } else {
                    TC = (Chris*CostChris+Roses*CostRoses+Lale*CostLale);
                }
            }
            break;
            case "N":
                if (Season.equals("Spring") || Season.equals("Summer")) {
                    CostChris=2;
                    CostRoses=4.10;
                    CostLale = 2.50;
                    if(Lale>=7 && Season.equals("Spring")) {
                        TC = (Chris*CostChris+Roses*CostRoses+Lale*CostLale)*0.95;
                    } else {
                        TC = (Chris*CostChris+Roses*CostRoses+Lale*CostLale);
                    }
                } else if (Season.equals("Autumn") || Season.equals("Winter")) {
                    CostChris=3.75;
                    CostLale=4.15;
                    CostRoses=4.50;
                if (Roses >= 10 && Season.equals("Winter")) {
                    TC = (Chris*CostChris+Roses*CostRoses+Lale*CostLale) * 0.9;
                } else {
                    TC = (Chris*CostChris+Roses*CostRoses+Lale*CostLale);
                }
            }
            break;
        }
        if ((Chris + Lale + Roses) > 20) {
            TC = TC * 0.8 +2;
        } else {
            TC = TC +2;
        }
        System.out.printf("%.2f", TC);
    }
}


