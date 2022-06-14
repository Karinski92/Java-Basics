package BasicCourse.ConditionalStatements.Lab;

import java.util.Scanner;

public class ExcellenResult {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grade = Integer.parseInt(s.nextLine());
        if (grade >= 5) {
            System.out.println("Excellent!");
        }
    }
}
