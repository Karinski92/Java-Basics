package BasicCourse.WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = Integer.parseInt(scanner.nextLine());
        int Sum = 0;
        while (Sum<Number) {
            int CurrentNumber = Integer.parseInt(scanner.nextLine());
            Sum += CurrentNumber;

        }
        System.out.println(Sum);
    }
}
