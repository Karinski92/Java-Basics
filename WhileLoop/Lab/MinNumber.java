package BasicCourse.WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int MinNumber = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int Number = Integer.parseInt(input);
            input = scanner.nextLine();
            if (Number<MinNumber) {
                MinNumber = Number;
            }
        }
        System.out.println(MinNumber);
    }
}
