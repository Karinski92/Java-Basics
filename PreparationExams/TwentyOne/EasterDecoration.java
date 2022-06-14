package BasicCourse.PreparationExams.TwentyOne;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Customers = Integer.parseInt(scanner.nextLine());

        double BasketCost = 1.50;
        double WreathCost = 3.80;
        double BunnyCost = 7.0;
        double TotalBills = 0;

        for (int i = 1; i <= Customers; i++) {
            String Product = scanner.nextLine();

            double Bill = 0;
            int Items = 0;

            while (!Product.equals("Finish")) {

                switch (Product) {
                    case "basket":
                        Bill += BasketCost;
                        Items++;
                        break;

                    case "wreath":
                        Bill += WreathCost;
                        Items++;
                        break;

                    case "chocolate bunny":
                        Bill += BunnyCost;
                        Items++;
                        break;

                    }

                Product = scanner.nextLine();

            }
            if (Items % 2 == 0) {
                Bill = Bill * 0.80;
            }
            TotalBills += Bill;

            System.out.printf("You purchased %d items for %.2f leva.%n", Items, Bill);

        }
        System.out.printf("Average bill per client is: %.2f leva.", TotalBills/Customers);
    }
}








