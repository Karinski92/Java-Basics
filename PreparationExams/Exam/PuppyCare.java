package BasicCourse.PreparationExams.Exam;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int KgBought = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int TotalGrams = 0;

        while (!input.equals("Adopted")) {
            int GramsDay = Integer.parseInt(input);
            TotalGrams += GramsDay;
            input = scanner.nextLine();
        }
        int TotGramsBought = KgBought * 1000;
        int Diff = Math.abs(TotGramsBought - TotalGrams);
        if (TotGramsBought >= TotalGrams) {
            System.out.printf("Food is enough! Leftovers: %d grams.", Diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Diff);
        }
    }
}
