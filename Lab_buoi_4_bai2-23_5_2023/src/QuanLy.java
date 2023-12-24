import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<KhachHangVietNam> list1;
    private ArrayList<KhacHangNuocNgoai> list2;

    public QuanLy() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }

    public void ThemHD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong hoa don can them: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i);
            System.out.print("Chon loai hoa don. \n1:Nguoi Viet Nam , 2:Nguoi Nuoc Ngoai ");
            int loai = scanner.nextInt();
            KhachHangVietNam KHVN = null;
            KhacHangNuocNgoai KHNN = null;
            if (loai == 1) {
                KHVN = new KhachHangVietNam();
                KHVN.Nhap_VN();
                list1.add(KHVN);
            } else if (loai == 2) {
                KHNN = new KhacHangNuocNgoai();
                if (KHNN != null) {
                    KHNN.Nhap_NN();
                    list2.add(KHNN);
                }

            }
        }
    }
    public void XuatHoaDon()
    {
        for (KhachHangVietNam KHVN : list1)
        {
            KHVN.ThanhTien_VN();
            KHVN.Xuat_VN();
        }
        for (KhacHangNuocNgoai KHNN : list2)
        {
            KHNN.ThanhTien_NN();
            KHNN.Xuat_NN();
        }
    }
}
