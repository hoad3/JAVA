import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        float a, b, c;
        double X = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ba so a:");
        a = scanner.nextFloat();
        System.out.println("nhap vao ba so b:");
        b = scanner.nextFloat();
        System.out.println("nhap vao ba so c:");
        c = scanner.nextFloat();
        if (a == 0.0f && b == 0.0f){
            System.out.println("Phuong trinh vo nghiem");
            return;
        }
        float delta = (b * b) - (4.0f * a * c);
        if (delta < 0.0f){
            System.out.println("Phuong trinh vo nghiem");
            return;
        } else if (delta == 0.0f){
            System.out.printf("Phuong trinh co nghiem x1 = x2 = %s%n", -b / (2.0f * a));
        } else {
            float x0 = -b / (2.0f * a);
            float x1 = (float) (x0 + (Math.sqrt(delta) / (2.0f * a)));
            float x2 = (float) (x0 - (Math.sqrt(delta) / (2.0f * a)));
            System.out.printf("Phuong trinh co nghiem x1 = %s | x2 = %s%n", x1, x2);
        }
    }
}

