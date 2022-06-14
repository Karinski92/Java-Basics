package BasicCourse.PreparationExams.Exam;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PageCost = Double.parseDouble(scanner.nextLine());
        double CoverCost = Double.parseDouble(scanner.nextLine());
        int Discount = Integer.parseInt(scanner.nextLine());
        double DesignerCost = Double.parseDouble(scanner.nextLine());
        int TeamInput = Integer.parseInt(scanner.nextLine());
        double InitAmount = 899 * PageCost + 2 * CoverCost;
        double DiscAmount = InitAmount - (InitAmount * Discount / 100);
        double CostWithDesign = DiscAmount + DesignerCost;
        double TotalCost = CostWithDesign - (CostWithDesign * TeamInput / 100);
        System.out.printf("Avtonom should pay %.2f BGN.", TotalCost);
    }
}
