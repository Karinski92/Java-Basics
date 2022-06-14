package BasicCourse.PreparationExams.Exam;

import java.util.Scanner;

public class CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Breed = scanner.nextLine();
        String Sex = scanner.nextLine();

        int CatLife = 0;

        switch (Sex) {
            case "m":
                if (Breed.equals("British Shorthair")) {
                    CatLife = (13 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if ( Breed.equals("Siamese")) {
                    CatLife = (15 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if (Breed.equals("Persian")) {
                    CatLife = (14 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if (Breed.equals("Ragdoll")) {
                    CatLife = (16 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if (Breed.equals("American Shorthair")) {
                    CatLife = (12 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if (Breed.equals("Siberian")) {
                    CatLife = (11 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else {
                    System.out.printf("%s is invalid cat!", Breed);
                }
                break;
            case "f":
                if (Breed.equals("British Shorthair")) {
                    CatLife = (14 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if ( Breed.equals("Siamese")) {
                    CatLife = (16 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if (Breed.equals("Persian")) {
                    CatLife = (15 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if (Breed.equals("Ragdoll")) {
                    CatLife = (17 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if (Breed.equals("American Shorthair")) {
                    CatLife = (13 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else if (Breed.equals("Siberian")) {
                    CatLife = (12 * 12) / 6;
                    System.out.printf("%d cat months", CatLife);
                } else {
                    System.out.printf("%s is invalid cat!", Breed);
                }
        }
    }
}
