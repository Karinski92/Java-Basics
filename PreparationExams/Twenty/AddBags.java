package BasicCourse.PreparationExams.Twenty;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double LuggageOverTwenty = Double.parseDouble(scanner.nextLine());
        double LuggageKg = Double.parseDouble(scanner.nextLine());
        int DaysToTravel = Integer.parseInt(scanner.nextLine());
        int LuggageNumber = Integer.parseInt(scanner.nextLine());
        double LuggageCost = 0;

        if (DaysToTravel > 30) {
            if (LuggageKg <= 10) {
                LuggageCost = (LuggageOverTwenty * 0.2) * 1.1;
            } else if (LuggageKg <= 20) {
                LuggageCost = (LuggageOverTwenty * 0.5) * 1.1;
            } else if (LuggageKg > 20){
                LuggageCost = (LuggageOverTwenty) * 1.1;
            }
        } else if (DaysToTravel <= 30 && DaysToTravel > 7) {
            if (LuggageKg <= 10) {
                LuggageCost = (LuggageOverTwenty * 0.2) * 1.15;
            } else if (LuggageKg <= 20) {
                LuggageCost = (LuggageOverTwenty * 0.5) * 1.15;
            } else if (LuggageKg > 20){
                LuggageCost = (LuggageOverTwenty) * 1.15;
            }
        } else if (DaysToTravel <= 7) {
            if (LuggageKg <= 10) {
                LuggageCost = (LuggageOverTwenty * 0.2) * 1.4;
            } else if (LuggageKg <= 20) {
                LuggageCost = (LuggageOverTwenty * 0.5) * 1.4;
            } else if (LuggageKg>20){
                LuggageCost = (LuggageOverTwenty) * 1.4;
            }
        }
        double TotalPrice = LuggageNumber * LuggageCost;
        System.out.printf("The total price of bags is: %.2f lv.", TotalPrice);


    }
}
