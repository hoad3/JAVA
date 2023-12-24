import java.util.Scanner;

import java.util.Scanner;

public class main {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        Data a = new Data();
        Dang_ky_xe b;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1. nhap thong tin dang ky xe");
        System.out.println("2. xuat thong tin dang ky xe\n");
        System.out.println("0.thoat");
        do {
            System.out.print(
                    "Lua chon: ");
            n = input.nextInt();
            switch (n) {
                case 1 -> {
                    b = new Dang_ky_xe();
                    a.DS(b);
                }
                case 2 -> {
                    System.out.format("%-26s %-26s %-26s %-26s %-26s\n", "ten chu xe", "loai xe", "dung tich", "tri gia", "thue phai nop");
                    System.out.println("==============================================================================================================================================");
                    a.hide();
                }
                default -> {
                }
            }
        } while (n != 0);
    }

}