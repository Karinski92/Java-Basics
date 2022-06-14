package BasicCourse.PreparationExams.TwentyOne;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PaintedEggs = Integer.parseInt(scanner.nextLine());

        int RedCount = 0;
        int OrangeCount =0;
        int BlueCount = 0;
        int GreenCount = 0;
        int MaxEggs = Integer.MIN_VALUE;
        String MaxColor = "";

        for (int i = 1; i <= PaintedEggs; i++) {
            String Color = scanner.nextLine();

            switch (Color) {
                case "red":
                    RedCount++;
                    break;
                case "orange":
                    OrangeCount++;
                    break;
                case "blue":
                    BlueCount++;
                    break;
                case "green":
                    GreenCount++;
                    break;
            }

            if (RedCount>MaxEggs) {
                MaxEggs = RedCount;
                MaxColor = "red";
            } else if (OrangeCount>MaxEggs) {
                MaxEggs = OrangeCount;
                MaxColor = "orange";
            } else if(BlueCount>MaxEggs) {
                MaxEggs = BlueCount;
                MaxColor = "blue";
            } else if (GreenCount>MaxEggs) {
                MaxEggs = GreenCount;
                MaxColor = "green";
            }


        }
        System.out.printf("Red eggs: %d%n", RedCount);
        System.out.printf("Orange eggs: %d%n", OrangeCount);
        System.out.printf("Blue eggs: %d%n", BlueCount);
        System.out.printf("Green eggs: %d%n", GreenCount);
        System.out.printf("Max eggs: %d -> %s", MaxEggs, MaxColor);


        }
    }

