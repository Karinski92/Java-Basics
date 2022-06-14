package BasicCourse.PreparationExams.TwentyOne;

import java.util.Scanner;

public class GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PictureTime = Integer.parseInt(scanner.nextLine());
        int Scenes = Integer.parseInt(scanner.nextLine());
        int SceneTime = Integer.parseInt(scanner.nextLine());
        double Preparation = PictureTime * 0.15;
        int AllSceneTime = SceneTime * Scenes;
        double TotalTime = Preparation + AllSceneTime;

        if (TotalTime > PictureTime) {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.abs(PictureTime-TotalTime));
        } else {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", Math.abs(TotalTime-PictureTime));
        }

    }
}
