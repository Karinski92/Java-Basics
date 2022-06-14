package BasicCourse.ConditionalStatements.Exercises;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Record = Double.parseDouble(scanner.nextLine());
        double Length = Double.parseDouble(scanner.nextLine());
        double Time = Double.parseDouble(scanner.nextLine());
        double TotTime1 = Length*Time;
        double Resistance = Math.floor(Length/15)*12.5;
        double TotTime = TotTime1+Resistance;
        if (TotTime<Record) {
            System.out.printf("Yes, he succeeded! The new world record is " + "%.2f" + " seconds.", TotTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", TotTime-Record);
        }
    }
}
