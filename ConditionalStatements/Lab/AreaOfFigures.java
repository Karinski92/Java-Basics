package BasicCourse.ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 0.0;
        if (shape.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
            System.out.printf("%.3f", area);
        } else if (shape.equals("rectangle")){
            double A = Double.parseDouble(scanner.nextLine());
            double B = Double.parseDouble(scanner.nextLine());
            area = A * B;
            System.out.printf("%.3f", area);
        } else if (shape.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius *radius * Math.PI;
            System.out.printf("%.3f", area);
        }else if (shape.equals("triangle")) {
            double lenght = Double.parseDouble(scanner.nextLine());
            double hight = Double.parseDouble(scanner.nextLine());
            area = (lenght * hight) / 2;
            System.out.printf("%.3f", area);
        }

    }
}
