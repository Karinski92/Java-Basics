package BasicCourse.NestedLoops.Exercises;


import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Movie = scanner.nextLine();

        int Student = 0;
        int Standard = 0;
        int Kid = 0;
        int TotTickets = 0;
        int TicketPerMovie = 0;

        while (!Movie.equals("Finish")) {
            int Seats = Integer.parseInt(scanner.nextLine());
            String TicketType = scanner.nextLine();

            while (!TicketType.equals("End")) {

                if (TicketType.equals("student")) {
                    Student ++;
                    TotTickets ++;
                    TicketPerMovie ++;
                }
                if (TicketType.equals("standard")) {
                    Standard ++;
                    TotTickets ++;
                    TicketPerMovie++;
                }
                if (TicketType.equals("kid")) {
                    Kid ++;
                    TotTickets ++;
                    TicketPerMovie ++;
                }

                if (TicketPerMovie >= Seats) {
                    break;
                }
                TicketType = scanner.nextLine();

            }
            System.out.printf("%s - %.2f%% full.%n", Movie, (1.0 *  TicketPerMovie/ Seats * 100));
            TicketPerMovie = 0;
            Movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", TotTickets);
        System.out.printf("%.2f%% student tickets.%n", (1.0 * Student / TotTickets * 100));
        System.out.printf("%.2f%% standard tickets.%n", (1.0 * Standard / TotTickets * 100));
        System.out.printf("%.2f%% kids tickets.%n", (1.0 * Kid / TotTickets * 100));
    }
}
