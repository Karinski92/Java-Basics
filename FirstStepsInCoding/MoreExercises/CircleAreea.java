package BasicCourse.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * Math.pow(r,2);
        double Parameter = 2 * Math.PI * r;
        System.out.printf("%.2f%n" + "%.2f", area, Parameter);
    }
}
