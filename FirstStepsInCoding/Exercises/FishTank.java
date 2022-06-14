package BasicCourse.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int L=Integer.parseInt(s.nextLine());
        int W=Integer.parseInt(s.nextLine());
        int H=Integer.parseInt(s.nextLine());
        double Space=Double.parseDouble(s.nextLine());
        double Dec=L*W*H;
        double DecL=Dec/1000;
        double P=(100-Space)/100;
        System.out.println(DecL*P);
    }
}
