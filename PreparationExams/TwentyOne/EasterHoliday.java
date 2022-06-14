package BasicCourse.PreparationExams.TwentyOne;

import java.util.Scanner;

public class EasterHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Destination = scanner.nextLine();
        String Dates = scanner.nextLine();
        int Nights = Integer.parseInt(scanner.nextLine());
        double TC = 0;
        switch (Destination) {
            case "Germany":
                if (Dates.equals("21-23")) {
                    TC = Nights * 32;
                } else if (Dates.equals("24-27")) {
                    TC = Nights * 37;
                } else if (Dates.equals("28-31")) {
                    TC = Nights * 43;
                }
                break;
            case "Italy":
                if (Dates.equals("21-23")) {
                    TC = Nights * 28;
                } else if (Dates.equals("24-27")) {
                    TC = Nights * 32;
                } else if (Dates.equals("28-31")) {
                    TC = Nights * 39;
                }
                break;
            case "France":
                if (Dates.equals("21-23")) {
                    TC = Nights * 30;
                } else if (Dates.equals("24-27")) {
                    TC = Nights * 35;
                } else if (Dates.equals("28-31")) {
                    TC = Nights * 40;
                }
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", Destination, TC);
    }
}
