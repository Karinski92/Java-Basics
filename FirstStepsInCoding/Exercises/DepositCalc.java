package BasicCourse.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double Deposit=Double.parseDouble(s.nextLine());
        int Months=Integer.parseInt(s.nextLine());
        double Rate=Double.parseDouble(s.nextLine());
        System.out.println(Deposit + (Months*((Deposit*Rate/100) / 12)));
    }
}
