package BasicCourse.PreparationExams.Exam;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int CatCount = Integer.parseInt(scanner.nextLine());

        int G1 = 0;
        int G2 = 0;
        int G3 = 0;
        double TotKG = 0;

        for (int i = 1; i <= CatCount ; i++) {
            double FoodKg = Double.parseDouble(scanner.nextLine());

            if (FoodKg >= 100 && FoodKg < 200) {
                G1 ++;
                TotKG += FoodKg;
            } else if (FoodKg >= 200 && FoodKg < 300) {
                G2 ++;
                TotKG += FoodKg;
            } else if (FoodKg >= 300 && FoodKg < 400) {
                G3 ++;
                TotKG += FoodKg;
            }
        }
        System.out.printf("Group 1: %d cats.%n", G1);
        System.out.printf("Group 2: %d cats.%n", G2);
        System.out.printf("Group 3: %d cats.%n", G3);
        System.out.printf("Price for food per day: %.2f lv.", TotKG/1000*12.45);

    }
}
