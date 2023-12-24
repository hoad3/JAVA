package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapList {
    public static void nhap(){
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            double x = sc.nextDouble();
            list.add(x);

            System.out.println(" Nhap them (Y/N) ?");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }


}
