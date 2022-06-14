package BasicCourse.ConditionalStatements2.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double priceOneProducts = 0;
        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                priceOneProducts = 0.50;
            } else if (product.equals("water")) {
                priceOneProducts = 0.80;
            } else if (product.equals("beer")) {
                priceOneProducts = 1.20;
            } else if (product.equals("sweets")) {
                priceOneProducts = 1.45;
            } else if (product.equals("peanuts")) {
                priceOneProducts = 1.60;
            }
        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                priceOneProducts = 0.40;
            } else if (product.equals("water")) {
                priceOneProducts = 0.70;
            } else if (product.equals("beer")) {
                priceOneProducts = 1.15;
            } else if (product.equals("sweets")) {
                priceOneProducts = 1.30;
            } else if (product.equals("peanuts")) {
                priceOneProducts = 1.50;
            }
        } else if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                priceOneProducts = 0.45;
            } else if (product.equals("water")) {
                priceOneProducts = 0.70;
            } else if (product.equals("beer")) {
                priceOneProducts = 1.10;
            } else if (product.equals("sweets")) {
                priceOneProducts = 1.35;
            } else if (product.equals("peanuts")) {
                priceOneProducts = 1.55;
            }
        }

        double totalPrice = quantity * priceOneProducts;
        System.out.println(totalPrice);
    }
}