import java.util.Scanner;
public class Main {


    private static Object DoanhThuCHuyenXeNoiThanh;
    private static Object DoanhThuXeNgoaiThanh;
    private static Object TongDoanhThu;

    public static void main(String[] args) {
        while (true){
            System.out.println("\nLua chon 1 xuat thong tin xe noi thanh");
            System.out.println("\nLua chon 2 xuat thong tin xe ngoai thanh");
            System.out.println("\nLua chon 3 xuat tong doanh thu");
            System.out.println("\nLua chon 4 thoat");
            int luachon;
            System.out.println("\nnhap lua chon");
            Scanner scanner = new Scanner(System.in);
            luachon = scanner.nextInt();
            if (luachon == 1)
            {
                ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh(987, "Nguyen Van A", "57B 04953", "tuyen_02", "200Km");
                chuyenXeNoiThanh.DoanhThuCHuyenXeNoiThanh();
                chuyenXeNoiThanh.XuatThongTin();
            } else if (luachon== 2)
            {
                ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh(867, "Tran Van B", "56B 4735", "Dong Nai", 12);
                chuyenXeNgoaiThanh.DoanhThuXeNgoaiThanh();
                chuyenXeNgoaiThanh.XuatThongTin();

            } else if (luachon == 3)
            {
                //ChuyenXe chuyenXe = new ChuyenXe();+
                //chuyenXe.XuatThongTin();
                ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh(987, "Nguyen Van A", "57B 04953", "tuyen_02", "200Km");
                //chuyenXeNoiThanh.DoanhThuCHuyenXeNoiThanh();
                // chuyenXeNoiThanh.XuatThongTin();
                ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh(867, "Tran Van B", "56B 4735", "Dong Nai", 12);
                //chuyenXeNgoaiThanh.DoanhThuXeNgoaiThanh();
                //chuyenXeNgoaiThanh.XuatThongTin();
                System.out.println("\ntong doanh thu la:"+ (chuyenXeNoiThanh.DoanhThuCHuyenXeNoiThanh()+ chuyenXeNgoaiThanh.DoanhThuXeNgoaiThanh()));
            }
            else if (luachon == 4)
            {
                break;
            }



        }
    }
}