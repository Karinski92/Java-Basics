package BasicCourse.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Magnolia = Integer.parseInt(scanner.nextLine());
        int Hyacinth = Integer.parseInt(scanner.nextLine());
        int Rose = Integer.parseInt(scanner.nextLine());
        int Cactus = Integer.parseInt(scanner.nextLine());
        double PresentCost = Double.parseDouble(scanner.nextLine());
        double TotalRevenue = Magnolia*3.25 + Hyacinth*4.00 + Rose*3.50 + Cactus*8.00;
        double Taxes = TotalRevenue*0.05;
        double Profit = TotalRevenue-Taxes;
        if (Profit>=PresentCost) {
            System.out.printf("She is left with %.0f leva.", Math.floor(Profit-PresentCost));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(PresentCost-Profit));
        }

    }
}
