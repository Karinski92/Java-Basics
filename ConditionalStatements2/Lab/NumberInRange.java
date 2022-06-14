package BasicCourse.ConditionalStatements2.Lab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = Integer.parseInt(scanner.nextLine());
        if (Number>=-100 && Number<=100 && Number !=0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
