package BasicCourse.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int Pens=Integer.parseInt(s.nextLine());
        int Mark=Integer.parseInt(s.nextLine());
        int Clean=Integer.parseInt(s.nextLine());
        int Discount=Integer.parseInt(s.nextLine());
        double TotalC=(Pens*5.8+Mark*7.2+Clean*1.2);
        System.out.println(TotalC-TotalC*Discount/100);
    }
}
