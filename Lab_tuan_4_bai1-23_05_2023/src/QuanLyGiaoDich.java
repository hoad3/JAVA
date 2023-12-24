import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyGiaoDich {
    private ArrayList<GiaoDichDat> list1;
    private ArrayList<GiaoDichNha> list2;

    public QuanLyGiaoDich() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }

    public void ThemGiaoDich() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong giao dich can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i);
            System.out.print("nhap lua chon (1: Giao dich dat, 2: Giao dich nha): ");
            int loai = sc.nextInt();

            QL_GiaoDichDat QLD = null;
            QL_GiaoDichNha QLN = null;
            if (loai == 1) {
                QLD = new QL_GiaoDichDat();
            } else if (loai == 2) {
                QLN = new QL_GiaoDichNha();


                if (QLD != null) {
                    QLD.Nhap_Dat();
                    list1.add(QLD);
                } else if (QLN != null) {
                    QLN.Nhap_Nha();
                    list2.add(QLN);
                }
            }
        }
    }


}
