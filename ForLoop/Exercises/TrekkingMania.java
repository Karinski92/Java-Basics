package BasicCourse.ForLoop.Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Group = Integer.parseInt(scanner.nextLine());
        double AllPpl = 0;
        int PplMusala = 0;
        int PplMonblan = 0;
        int PplKilimanjaro = 0;
        int PplK2 = 0;
        int PplEverest = 0;

        for (int i = 0; i < Group; i++) {
            int PplInGroup = Integer.parseInt(scanner.nextLine());
            AllPpl += PplInGroup;
            if (PplInGroup<=5) {
                PplMusala += PplInGroup;
            } else if (PplInGroup <= 12) {
                PplMonblan += PplInGroup;
            } else if (PplInGroup <=25) {
                PplKilimanjaro += PplInGroup;
            } else if (PplInGroup <= 40) {
                PplK2 += PplInGroup;
            } else if (PplInGroup > 40) {
                PplEverest += PplInGroup;
            }
        }
        double DMusala = PplMusala/AllPpl*100;
        System.out.printf("%.2f%%%n",DMusala);
        double DMonblan = PplMonblan/AllPpl*100;
        System.out.printf("%.2f%%%n",DMonblan);
        double DKilimanjaro = PplKilimanjaro/AllPpl *100;
        System.out.printf("%.2f%%%n", DKilimanjaro);
        double DK2 = PplK2/AllPpl*100;
        System.out.printf("%.2f%%%n", DK2);
        double DEverest = PplEverest/AllPpl*100;
        System.out.printf("%.2f%%%n", DEverest);
    }
}
