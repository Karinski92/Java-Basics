package BasicCourse.ConditionalStatements.Exercises;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int AllMinutes = hour*60 + minutes;
        int MinutesAhead = AllMinutes+15;
        int HA = MinutesAhead/60;
        int MA = MinutesAhead%60;
        if (HA>23) {
            HA=0;
            System.out.printf("%d:%02d",HA,MA);
        } else {
            System.out.printf("%d:%02d",HA,MA);
        }
    }
}
