package BasicCourse.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int BookP = Integer.parseInt(s.nextLine());
        int Pages = Integer.parseInt(s.nextLine());
        int Days = Integer.parseInt(s.nextLine());
        System.out.println(BookP / Pages / Days);
    }
}
