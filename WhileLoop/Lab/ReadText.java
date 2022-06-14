package BasicCourse.WhileLoop.Lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Words = scanner.nextLine();
        while (!Words.equals("Stop")) {
            System.out.println(Words);
            Words= scanner.nextLine();
        }

    }
}
