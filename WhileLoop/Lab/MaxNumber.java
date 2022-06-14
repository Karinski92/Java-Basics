package BasicCourse.WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int MaxNumber = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int Number = Integer.parseInt(input);
            input = scanner.nextLine();
            if (Number>MaxNumber) {
                MaxNumber = Number;
            }
        }
        System.out.println(MaxNumber);
    }
}
