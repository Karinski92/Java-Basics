package BasicCourse.WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FailGrades = Integer.parseInt(scanner.nextLine());
        int NumFails = 0;
        int NumSolved = 0;
        double SumGrades = 0;
        String LastProblem = "";
        boolean Failed = true;
        while (NumFails<FailGrades) {
            String ProblemName = scanner.nextLine();
            if (ProblemName.equals("Enough")) {
                Failed = false;
                break;
            }
            int Grade = Integer.parseInt(scanner.nextLine());
            if (Grade<=4) {
                NumFails++;
            }
            NumSolved++;
            SumGrades += Grade;
            LastProblem = ProblemName;
        }
        if (Failed) {
            System.out.printf("You need a break, %d poor grades.", FailGrades);
        } else {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", SumGrades/NumSolved, NumSolved, LastProblem);
        }
    }
}
