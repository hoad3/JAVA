import java.util.Scanner;
public class Main {
    public static void main(String[] args)

    {

        Menu();
    }
    public static void Menu(){
        while (true){
            System.out.println("\n 1.giai PT bac nhat");
            System.out.println("\n 2.Giai PT bac hai");
            System.out.println("\n 3.tinh tien dien");
            System.out.println("\n 4.thoat");
            int luachon;
            System.out.println("\nnhap lua chon");
            Scanner scanner = new Scanner(System.in);
            luachon = scanner.nextInt();
            if (luachon == 1)
            {
                Giai_PT_bac1();
            } else if (luachon== 2)
            {
                Giai_PT_bac2();
            } else if (luachon == 3)
            {
                Tinh_tien_dien();
            } else if (luachon == 4)
            {
                break;
            }
        }
    }
    public static void Giai_PT_bac1()
    {
        float a,b;
        float tong = 0;
        System.out.println("Nhap vao hai so nguyen a,b:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        if (a==0)
            if(b==0)

                System.out.println("phuong trinh vo so nghiem:");
            else
                System.out.println("phuong trinh vo nghiem:");
        else
            tong = -b/a;
        System.out.printf("nghiem cua phuong trinh = %s%n", tong);
    }
    public static void Giai_PT_bac2() {
        float a, b, c;
        double X = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ba so a:");
        a = scanner.nextFloat();
        System.out.println("nhap vao ba so b:");
        b = scanner.nextFloat();
        System.out.println("nhap vao ba so c:");
        c = scanner.nextFloat();
        if (a == 0.0f && b == 0.0f) {
            System.out.println("Phuong trinh vo nghiem");
            return;
        }
        float delta = (b * b) - (4.0f * a * c);
        if (delta < 0.0f) {
            System.out.println("Phuong trinh vo nghiem");
            return;
        } else if (delta == 0.0f) {
            System.out.printf("Phuong trinh co nghiem x1 = x2 = %s%n", -b / (2.0f * a));
        } else {
            float x0 = -b / (2.0f * a);
            float x1 = (float) (x0 + (Math.sqrt(delta) / (2.0f * a)));
            float x2 = (float) (x0 - (Math.sqrt(delta) / (2.0f * a)));
            System.out.printf("Phuong trinh co nghiem x1 = %s | x2 = %s%n", x1, x2);
        }
    }
    public static void Tinh_tien_dien() {
        int sodien;
        int tien = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so dien trong thang:");
        sodien = scanner.nextInt();
        if (sodien <= 50) {
            tien = sodien * 1000;
            System.out.println("so tien dien phai tra trong thang la:" + tien);
        } else {
            tien = 50 * 1000 + (sodien - 50) * 1200;
            System.out.println("so tien dien phai tra trong thang la:" + tien);
        }
    }
    public static void MenuSwitchCase(){

        System.out.println("\n 1.giai PT bac nhat");
        System.out.println("\n 2.Giai PT bac hai");
        System.out.println("\n 3.tinh tien dien");
        System.out.println("\n 4.thoat");
        int luachon;
        System.out.println("\nnhap lua chon");
        Scanner scanner = new Scanner(System.in);
        luachon = scanner.nextInt();
        switch (luachon )
        {
            case 1:
                Giai_PT_bac1();
            case 2:
                Giai_PT_bac2();
            case 3:
                Tinh_tien_dien();
            case 4:
                break;
            default:
                System.out.println("nhap lua chon tu 1->4");
        }
    }
}