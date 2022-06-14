package BasicCourse.WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String StudentName = scanner.nextLine();
        int Classes = 1;
        int Fail = 0;
        double SumGrades = 0;
        while (Classes <= 12) {
            if (Fail == 2) {
                break;
            }
            double ClassGrade = Double.parseDouble(scanner.nextLine());
            if (ClassGrade < 4) {
                Fail++;
                continue;
            }
            SumGrades += ClassGrade;
            Classes++;
        }
        if (Classes > 12) {
            System.out.printf("%s graduated. Average grade: %.2f", StudentName, SumGrades / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", StudentName, Classes);
        }
    }
}




