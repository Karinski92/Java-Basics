package BasicCourse.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=Integer.parseInt(s.nextLine());
        int P=Integer.parseInt(s.nextLine());
        int D=Integer.parseInt(s.nextLine());
        int H=Integer.parseInt(s.nextLine());
        double MatC=(N+2)*1.5+P*14.5*1.1+D*5+0.4;
        double LabC=MatC*0.3*H;
        double TotalC=MatC+LabC;
        System.out.println(TotalC);
    }
}
