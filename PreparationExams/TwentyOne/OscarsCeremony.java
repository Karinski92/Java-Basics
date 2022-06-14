package BasicCourse.PreparationExams.TwentyOne;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Rent = Integer.parseInt(scanner.nextLine());
        double FigurineCost = Rent - (Rent * 0.30);
        double CateringCost = FigurineCost * 0.85;
        double SoundCost = CateringCost * 0.50;
        double TC = FigurineCost + CateringCost + SoundCost + Rent;
        System.out.printf("%.2f", TC);
    }
}
