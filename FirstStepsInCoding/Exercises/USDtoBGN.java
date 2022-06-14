package BasicCourse.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double USD = Double.parseDouble(s.nextLine());
        double BGN = USD * 1.79549;
        System.out.println(BGN);
    }
}
