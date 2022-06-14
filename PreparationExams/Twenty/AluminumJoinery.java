package BasicCourse.PreparationExams.Twenty;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double NumDograma = Double.parseDouble(scanner.nextLine());
        String DogramaType = scanner.nextLine();
        String DeliveryType = scanner.nextLine();
        double TotCost = 0;

        switch (DeliveryType) {
            case "Without delivery":
                if (DogramaType.equals("90X130")) {
                    if (NumDograma <= 30 && NumDograma > 10) {
                        TotCost = NumDograma * 110;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 60 && NumDograma > 10) {
                        TotCost = (NumDograma * 110) * 0.95;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 99 && NumDograma > 10) {
                        TotCost = (NumDograma * 110) * 0.92;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma > 99){
                        TotCost = (NumDograma * 110) * 0.88;
                        System.out.printf("%.2f BGN", TotCost);
                    } else {
                        System.out.println("Invalid order");
                    }
                } else if ( DogramaType.equals("100X150")) {
                    if (NumDograma <= 40 && NumDograma > 10) {
                        TotCost = NumDograma * 140;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 80 && NumDograma > 10) {
                        TotCost = (NumDograma * 140) * 0.94;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 99 && NumDograma > 10) {
                        TotCost = (NumDograma * 140) * 0.9;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma > 99){
                        TotCost = (NumDograma * 140) * 0.86;
                        System.out.printf("%.2f BGN", TotCost);
                    }else {
                        System.out.println("Invalid order");
                    }
                } else if (DogramaType.equals("130X180")) {
                    if (NumDograma <= 20 && NumDograma > 10) {
                        TotCost = NumDograma * 190;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 50 && NumDograma > 10) {
                        TotCost = (NumDograma * 190) * 0.93;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 99 && NumDograma > 10) {
                        TotCost = (NumDograma * 190) * 0.88;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma > 99){
                        TotCost = (NumDograma * 190) * 0.84;
                        System.out.printf("%.2f BGN", TotCost);
                    }else {
                        System.out.println("Invalid order");
                    }
                } else if (DogramaType.equals("200X300")) {
                    if (NumDograma <= 25 && NumDograma > 10) {
                        TotCost = NumDograma * 250;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 50 && NumDograma > 10) {
                        TotCost = (NumDograma * 250) * 0.91;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 99 && NumDograma > 10) {
                        TotCost = (NumDograma * 250) * 0.86;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma > 99){
                        TotCost = (NumDograma * 250) * 0.82;
                        System.out.printf("%.2f BGN", TotCost);
                    }else {
                        System.out.println("Invalid order");
                    }
                }
                break;
            case "With delivery":
                if (DogramaType.equals("90X130")) {
                    if (NumDograma <= 30 && NumDograma > 10) {
                        TotCost = NumDograma * 110 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 60 && NumDograma > 10) {
                        TotCost = (NumDograma * 110) * 0.95 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 99 && NumDograma > 10) {
                        TotCost = (NumDograma * 110) * 0.92 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma > 99){
                        TotCost = ((NumDograma * 110) * 0.92 +60) * 0.96;
                        System.out.printf("%.2f BGN", TotCost);
                    }else {
                        System.out.println("Invalid order");
                    }
                } else if ( DogramaType.equals("100X150")) {
                    if (NumDograma <= 40 && NumDograma > 10) {
                        TotCost = NumDograma * 140 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 80 && NumDograma > 10) {
                        TotCost = (NumDograma * 140) * 0.94 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 99 && NumDograma > 10) {
                        TotCost = (NumDograma * 140) * 0.9 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma > 99){
                        TotCost = ((NumDograma * 140) * 0.9 + 60) * 0.96;
                        System.out.printf("%.2f BGN", TotCost);
                    } else {
                        System.out.println("Invalid order");
                    }
                } else if (DogramaType.equals("130X180")) {
                    if (NumDograma <= 20 && NumDograma > 10) {
                        TotCost = NumDograma * 190 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 50 && NumDograma > 10) {
                        TotCost = (NumDograma * 190) * 0.93 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 99 && NumDograma > 10) {
                        TotCost = (NumDograma * 190) * 0.88 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma > 99){
                        TotCost = ((NumDograma * 190) * 0.88 + 60) * 0.96;
                        System.out.printf("%.2f BGN", TotCost);
                    } else {
                        System.out.println("Invalid order");
                    }
                } else if (DogramaType.equals("200X300")) {
                    if (NumDograma <= 25 && NumDograma > 10) {
                        TotCost = NumDograma * 250 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 50 && NumDograma > 10) {
                        TotCost = (NumDograma * 250) * 0.91 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma <= 99 && NumDograma > 10) {
                        TotCost = (NumDograma * 250) * 0.86 + 60;
                        System.out.printf("%.2f BGN", TotCost);
                    } else if (NumDograma > 99){
                        TotCost = ((NumDograma * 250) * 0.86 + 60) * 0.96;
                        System.out.printf("%.2f BGN", TotCost);
                    } else {
                        System.out.println("Invalid order");
                    }
                }
                break;
        }

        }
    }