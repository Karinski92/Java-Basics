package BasicCourse.WhileLoop.Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String Username = scanner.nextLine();
        String Password = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals(Password)) {
            input = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", Username);
    }
}
