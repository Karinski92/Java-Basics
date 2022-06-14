package BasicCourse.PreparationExams.Twenty;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Airline = scanner.nextLine();
        int AdultTickets = Integer.parseInt(scanner.nextLine());
        int KidsTickets = Integer.parseInt(scanner.nextLine());
        double AdultCost = Double.parseDouble(scanner.nextLine());
        double ServiceCost = Double.parseDouble(scanner.nextLine());
        double KidsCost = AdultCost * 0.30;
        double AdultWithService = AdultCost + ServiceCost;
        double KidsWithService = KidsCost + ServiceCost;
        double TotalCost = AdultTickets * AdultWithService + KidsTickets * KidsWithService;
        double Profit = TotalCost * 0.20;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", Airline, Profit);
    }
}
