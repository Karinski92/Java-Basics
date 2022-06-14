package BasicCourse.ConditionalStatements2.Exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Grad = Integer.parseInt(scanner.nextLine());
        String Day = scanner.nextLine();
        if (Day.equals("Morning")) {
            if (Grad>=10 && Grad<=18) {
                System.out.println("It's " + Grad + " degrees, get your Sweatshirt and Sneakers.");
            } else if (Grad>18 && Grad<=24) {
                System.out.println("It's " + Grad + " degrees, get your Shirt and Moccasins.");
            } else if (Grad>=25) {
                System.out.println("It's " + Grad + " degrees, get your T-Shirt and Sandals.");
            }
        } else if (Day.equals("Afternoon")) {
            if (Grad>=10 && Grad<=18) {
                System.out.println("It's " + Grad + " degrees, get your Shirt and Moccasins.");
            } else if (Grad>18 && Grad<=24) {
                System.out.println("It's " + Grad + " degrees, get your T-Shirt and Sandals.");
            } else if (Grad>=25) {
                System.out.println("It's " + Grad + " degrees, get your Swim Suit and Barefoot.");
            }
        } else if(Day.equals("Evening")) {
            if (Grad>=10 && Grad<=18) {
                System.out.println("It's " + Grad + " degrees, get your Shirt and Moccasins.");
            } else if (Grad>18 && Grad<=24) {
                System.out.println("It's " + Grad + " degrees, get your Shirt and Moccasins.");
            } else if (Grad>=25) {
                System.out.println("It's " + Grad + " degrees, get your Shirt and Moccasins.");
            }
        }

    }
}
