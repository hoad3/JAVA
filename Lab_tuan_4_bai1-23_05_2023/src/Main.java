import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich QLGD = new QuanLyGiaoDich();
        QL_GiaoDichDat QLD = new QL_GiaoDichDat();
        QL_GiaoDichNha QLN = new QL_GiaoDichNha();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1.Giao dich dat" + "\n2.Giao dich nha" + "\n3.thoat");
        int i = scanner.nextInt();
        if (i == 1)
        {
            QLD = new QL_GiaoDichDat();
            QLD.Nhap_Dat();
            QLD.Xuat_Dat();
            QLD.ThanhTien();

        }
        if (i == 2)
        {
            QLN = new QL_GiaoDichNha();
            QLN.Nhap_Nha();
            QLN.Xuat_Nha();
            QLN.ThanhTien();
        }
    }
}