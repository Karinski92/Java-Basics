package BasicCourse.ConditionalStatements2.Lab;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Product = scanner.nextLine();
        if (Product.equals("banana") || Product.equals("apple") || Product.equals("kiwi")
        || Product.equals("cherry") || Product.equals("lemon") || Product.equals("grapes")) {
            System.out.println("fruit");
        } else if (Product.equals("tomato") || Product.equals("cucumber") || Product.equals("pepper")
        || Product.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
