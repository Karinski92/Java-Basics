package BasicCourse.ConditionalStatements2.Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Hour = Integer.parseInt(scanner.nextLine());
        String Day = scanner.nextLine();
        if (Hour >= 10 && Hour <= 18) {
            if (Day.equals("Monday") || Day.equals("Tuesday") || Day.equals("Wednesday") || Day.equals("Thursday")
                    || Day.equals("Friday") || Day.equals("Saturday")) {
                System.out.println("open");
            } else if (Day.equals("Sunday")) {
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}