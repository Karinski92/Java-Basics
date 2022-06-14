package BasicCourse.ConditionalStatements2.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ExamHour = Integer.parseInt(scanner.nextLine());
        int ExamMinute = Integer.parseInt(scanner.nextLine());
        int ArrivalHour = Integer.parseInt(scanner.nextLine());
        int ArrivalMinute = Integer.parseInt(scanner.nextLine());
        int examTime = (ExamHour * 60) + ExamMinute;
        int arrivalTime = (ArrivalHour * 60) + ArrivalMinute;

        int diff = Math.abs(examTime - arrivalTime);
        if (examTime<arrivalTime) {
            System.out.println("Late");
            if (diff>=60) {
                int hour = diff / 60;
                int minute = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minute);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        }else if (examTime==arrivalTime || (diff >= 1 && diff <= 30)) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }

        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, min);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }

        }
    }
}