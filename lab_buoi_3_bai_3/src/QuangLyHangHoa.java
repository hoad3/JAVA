import java.util.ArrayList;
import java.util.Scanner;

public class QuangLyHangHoa
{
    private ArrayList<HangHoa> list;

    public QuangLyHangHoa() {
        list = new ArrayList<>();
    }

    public void themHangHoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hang hoa: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i);
            System.out.print("Chon loai hang hoa (1: Dien may, 2: Thuc pham, 3: Sanh su): ");
            int loai = sc.nextInt();

            HangHoa hh = null;

            if (loai == 1) {
                hh = new HangDienMay();
            } else if (loai == 2) {
                hh = new HangThucPham();
            } else if (loai == 3) {
                hh = new HangSanhSu();
            }

            if (hh != null) {
                hh.nhap();
                list.add(hh);
            }
        }
    }

    public void xuatHangHoa() {
        for (HangHoa hh : list) {
            hh.xuat();
        }
    }
}
