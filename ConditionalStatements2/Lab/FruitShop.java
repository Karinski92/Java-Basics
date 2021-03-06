package BasicCourse.ConditionalStatements2.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0.0;
        boolean isValid = true;
//        Магазин за плодове през работните дни работи на следните цени:
//        плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//        цена	2.50	1.20	0.85	  1.45	   2.70   	 5.50	      3.85
//
//
//        Събота и неделя магазинът работи на по-високи цени:
//        плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//        цена	2.70	1.25	0.90	  1.60	    3.00	     5.60    4.20
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")
                || dayOfWeek.equals("Friday")) {
            if (fruit.equals("banana")) {
                totalPrice = quantity * 2.50;
            } else if (fruit.equals("apple")) {
                totalPrice = quantity * 1.20;
            } else if (fruit.equals("orange")) {
                totalPrice = quantity * 0.85;
            } else if (fruit.equals("grapefruit")) {
                totalPrice = quantity * 1.45;
            } else if (fruit.equals("kiwi")) {
                totalPrice = quantity * 2.70;
            } else if (fruit.equals("pineapple")) {
                totalPrice = quantity * 5.50;
            } else if (fruit.equals("grapes")) {
                totalPrice = quantity * 3.85;
            } else {
                isValid = false;
            }
        }
        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            if (fruit.equals("banana")) {
                totalPrice = quantity * 2.70;
            } else if (fruit.equals("apple")) {
                totalPrice = quantity * 1.25;
            } else if (fruit.equals("orange")) {
                totalPrice = quantity * 0.90;
            } else if (fruit.equals("grapefruit")) {
                totalPrice = quantity * 1.60;
            } else if (fruit.equals("kiwi")) {
                totalPrice = quantity * 3.00;
            } else if (fruit.equals("pineapple")) {
                totalPrice = quantity * 5.60;
            } else if (fruit.equals("grapes")) {
                totalPrice = quantity * 4.20;
            } else {
                isValid = false;
            }
        }
        if (isValid) {
            System.out.printf("%.2f", totalPrice);
        } else {
            System.out.println("error");
        }
    }
}

