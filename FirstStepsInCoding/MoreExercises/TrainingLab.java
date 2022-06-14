package BasicCourse.FirstStepsInCoding.MoreExercises;


import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double DesksPerRow = (h * 100 - 100) / 70;
        int DPR = (int) DesksPerRow;
        double Rows = w*100/120;
        int R = (int) Rows;
        int NumPlaces = DPR * R - 3;
        System.out.println(NumPlaces);
    }
}
