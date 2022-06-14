package BasicCourse.WhileLoop.Lab;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int Number = 1;
        while (Number<= n) {
            System.out.println(Number);
            Number = Number*2+1;
        }
    }
}
