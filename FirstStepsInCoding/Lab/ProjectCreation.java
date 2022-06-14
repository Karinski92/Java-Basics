package BasicCourse.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hours = projects*3;
        System.out.println("The architect " + firstName + " will need " + hours + " hours to complete " + projects + " project/s.");
    }
}
