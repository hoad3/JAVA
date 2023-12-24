import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        QuanLy QL = new QuanLy();
        KhachHangVietNam KHVN = new KhachHangVietNam();
        KhacHangNuocNgoai KHNN = new KhacHangNuocNgoai();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1.them hoa don" + "\n2.xuat hoa don");
        int i = scanner.nextInt();
        if (i == 1) {
            KHVN = new KhachHangVietNam();
            QL.ThemHD();
            QL.XuatHoaDon();
        }
        if ( i == 2 ){
            KHNN = new KhacHangNuocNgoai();
            QL.ThemHD();
            QL.XuatHoaDon();
        }
    }
}