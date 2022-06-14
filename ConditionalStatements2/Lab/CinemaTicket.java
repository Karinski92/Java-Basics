package BasicCourse.ConditionalStatements2.Lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Day = scanner.nextLine();
        int TicketPrice = 0;
        if (Day.equals("Monday") || Day.equals("Tuesday") || Day.equals("Friday")) {
            TicketPrice = 12;
        } else if (Day.equals("Wednesday") || Day.equals("Thursday")) {
            TicketPrice = 14;
        } else if (Day.equals("Saturday") || Day.equals("Sunday")) {
            TicketPrice = 16;
        }
        System.out.println(TicketPrice);
    }
}
