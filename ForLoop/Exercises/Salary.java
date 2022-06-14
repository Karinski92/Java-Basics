package BasicCourse.ForLoop.Exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int OpenBrowsers = Integer.parseInt(scanner.nextLine());
        int Salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= OpenBrowsers; i++) {
            if (Salary>0) {
                String Website = scanner.nextLine();
                switch (Website) {
                    case "Facebook":
                        Salary = Salary-150;
                        break;
                    case "Instagram":
                        Salary = Salary-100;
                        break;
                    case "Reddit":
                        Salary = Salary-50;
                        break;
                }
            }
            
        }
        if (Salary<=0) {
            System.out.printf("You have lost your salary.");
        } else {
            System.out.println(Salary);
        }
    }
}
