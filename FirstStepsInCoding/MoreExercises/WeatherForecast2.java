package BasicCourse.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Degrees = Double.parseDouble(scanner.nextLine());
        if (Degrees>=26.00 && Degrees<=35.00) {
            System.out.println("Hot");
        } else if (Degrees>=20.1 && Degrees<=25.9) {
            System.out.println("Warm");
        } else if (Degrees>=15.00 && Degrees<=20.00) {
            System.out.println("Mild");
        } else if (Degrees>=12.00 && Degrees<=14.9) {
            System.out.println("Cool");
        } else if (Degrees>=5.00 && Degrees<=11.9) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
