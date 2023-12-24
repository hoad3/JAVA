import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        List L = new List();
        CD cd = new CD();
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            L.menu();
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1) {
                cd = new CD();
                L.themCD(cd);
            } else if (luachon == 2) {
                L.inDSCD();
            } else if (luachon == 3) {
                System.out.println("So tai khoan hien co la: " + L.soLuong());
            } else if (luachon == 4) {
                System.out.println("Tong gia thanh CD la: " + L.tongGia());
            } else if (luachon == 5) {
                L.sapXepCDTheoGia();
                L.inDSCD();
            } else if (luachon == 6) {
                L.sapXepCDTheoTen();
                L.inDSCD();
            }
        } while (luachon != 0);
    }
}