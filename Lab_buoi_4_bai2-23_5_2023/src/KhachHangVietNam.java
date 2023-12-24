import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KhachHangVietNam extends HoaDon
{
    public double ThanhTien;
    public KhachHangVietNam()
    {

    }
    public KhachHangVietNam(String MaKH,  String HoTen, LocalDate NgayRaHD,
                            String DoiTuong, double SoLuong, double DonGia,
                            double DinhMuc)
    {
        this.ThanhTien = ThanhTien;
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.NgayRaHD = NgayRaHD;
        this.DoiTuong = DoiTuong;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.DinhMuc = DinhMuc;
    }
    public double getThanhTien()
    {
        return ThanhTien;
    }
    public void setThanhTien()
    {
        this.ThanhTien = ThanhTien;
    }
    public void Nhap_VN()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ma khach hang: ");
        MaKH = scanner.nextLine();
        System.out.println("nhap vao ho ten: ");
        HoTen = scanner.nextLine();
        System.out.println("nhap vao ngay ra hoa don: ");
        String NgayRaHDString = scanner.nextLine();
        LocalDate NgayRaHD =LocalDate.parse(NgayRaHDString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.NgayRaHD = NgayRaHD;
        System.out.println("nhap vao doi tuong: ");
        DoiTuong = scanner.nextLine();
        System.out.println("nhap vao so luong: ");
        SoLuong = scanner.nextDouble();
        System.out.println("nhap vao don gia: ");
        DonGia = scanner.nextDouble();
        System.out.println("nhap vao dinh muc: ");
        DinhMuc = scanner.nextDouble();


    }
    public void Xuat_VN()
    {
        System.out.printf("\n%-26s %-26s %-26s %-26s %26s", this.MaKH, this.HoTen,
                this.NgayRaHD, this.DoiTuong, this.SoLuong, this.DonGia, this.DinhMuc);
    }
    public void ThanhTien_VN()
    {
        if (SoLuong <= DinhMuc)
        {
            ThanhTien = SoLuong * DonGia;
        }
        else
        {
            ThanhTien = SoLuong * DonGia * 2.5;
        }
        System.out.printf("\n so tien ma khach hang Viet Nam phai tra la: " + ThanhTien);
    }
}
