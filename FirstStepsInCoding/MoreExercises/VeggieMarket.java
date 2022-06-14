package BasicCourse.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VeggieMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double SpVeggies = Double.parseDouble(scanner.nextLine());
        double SpFruits = Double.parseDouble(scanner.nextLine());
        int KgVeggies = Integer.parseInt(scanner.nextLine());
        int KgFruits = Integer.parseInt(scanner.nextLine());
        double TCVeggies = SpVeggies * KgVeggies;
        double TCFruits = SpFruits * KgFruits;
        double TC = (TCFruits+TCVeggies) / 1.94;
        System.out.printf("%.2f", TC);
    }
}
