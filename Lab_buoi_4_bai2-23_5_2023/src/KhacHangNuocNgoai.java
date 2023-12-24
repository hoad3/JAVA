import java.time.LocalDate;
import java.util.Scanner;

public class KhacHangNuocNgoai extends HoaDon
{
    public String QuocTich;
    public double ThanhTien;
    public KhacHangNuocNgoai()
    {

    }
    public KhacHangNuocNgoai(String MaKH,  String HoTen, LocalDate NgayRaHD,
                             String DoiTuong, double SoLuong, double DonGia,
                             double DinhMuc, String QuocTich, double ThanhTien)
    {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.NgayRaHD = NgayRaHD;
        this.DoiTuong = DoiTuong;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.QuocTich = QuocTich;
        this.ThanhTien = ThanhTien;
    }
    public String getQuocTich()
    {
        return QuocTich;
    }
    public void setQuocTich()
    {
        this.QuocTich = QuocTich;
    }
    public double getThanhTien()
    {
        return ThanhTien;
    }
    public void setThanhTien()
    {
        this.ThanhTien =ThanhTien;
    }
    public void Nhap_NN()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ma khach hang: ");
        MaKH = scanner.nextLine();
        System.out.println("nhap vao ho ten: ");
        HoTen = scanner.nextLine();
        System.out.println("nhap vao ngay ra hoa don: ");
        this.NgayRaHD = LocalDate.parse(scanner.nextLine());
        System.out.println("nhap vao doi tuong: ");
        DoiTuong = scanner.nextLine();
        System.out.println("nhap vao quoc tich: ");
        QuocTich = scanner.nextLine();
        System.out.println("nhap vao so luong: ");
        SoLuong = scanner.nextDouble();
        System.out.println("nhap vao don gia: ");
        DonGia = scanner.nextDouble();

    }
    public void Xuat_NN()
    {
        System.out.printf("\n%-26s %-26s %-26s %-26s %26s %26s %26s", this.MaKH, this.HoTen,
                this.NgayRaHD, this.DoiTuong, this.QuocTich, this.SoLuong, this.DonGia);
    }
    public void ThanhTien_NN()
{
    ThanhTien = SoLuong * DonGia;
    System.out.println("\n so tien ma khach hang Viet Nam phai tra la: " + ThanhTien);
}

}
