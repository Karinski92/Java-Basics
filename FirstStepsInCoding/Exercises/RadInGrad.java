package BasicCourse.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class RadInGrad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radians = Double.parseDouble(s.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}
