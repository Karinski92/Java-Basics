package BasicCourse.WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double Balance = 0.00;
        while (!input.equals("NoMoreMoney")) {
            double Amount = Double.parseDouble(input);
            if (Amount< 0) {
                System.out.println("Invalid operation!");
                break;
            }
            Balance += Amount;
            System.out.printf("Increase: %.2f%n", Amount);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", Balance);

    }
}
