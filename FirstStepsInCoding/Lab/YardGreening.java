package BasicCourse.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double TC = area * 7.61;
        double Disc = TC * 18 / 100;
        double FC = TC-Disc;
        System.out.printf("The final price is: %f lv.%n" + "The discount is: %f lv.", FC, Disc);
    }
}
