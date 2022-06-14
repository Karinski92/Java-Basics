package BasicCourse.ConditionalStatements2.Lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = Integer.parseInt(scanner.nextLine());
        boolean IsValid = Number>=100 && Number<=200 || Number==0;
        if (!IsValid) {
            System.out.println("invalid");
        }
    }
}
