package BasicCourse.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int Chicken=Integer.parseInt(s.nextLine());
        int Fish=Integer.parseInt(s.nextLine());
        int Veggie=Integer.parseInt(s.nextLine());
        double TotalC=Chicken*10.35+Fish*12.4+Veggie*8.15;
        double Dessert=TotalC*0.2;
        System.out.println(TotalC+Dessert+2.5);
    }
}
