package BasicCourse.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int DogFood = Integer.parseInt(s.nextLine());
        int CatFood = Integer.parseInt(s.nextLine());
        System.out.println(DogFood * 2.5 + CatFood * 4 + " lv.");
    }
}
