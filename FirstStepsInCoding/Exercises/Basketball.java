package BasicCourse.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int CostY=Integer.parseInt(s.nextLine());
        double Shoes=CostY-CostY*0.4;
        double Clothes=Shoes*0.8;
        double Ball=Clothes/4;
        double Ac=Ball/5;
        System.out.println(CostY+Shoes+Clothes+Ball+Ac);
    }
}
