import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GiaoDichDat
{
    public String MaGiaoDich;
    public LocalDate NgayGiaoDich;
    public double DonHGia;
    public String LoaiDat;
    public double DienTich;
    Scanner scanner = new Scanner(System.in);
    public GiaoDichDat()
    {

    }
    public GiaoDichDat (String MaGiaoDich, LocalDate NgayGiaoDich, double DonHGia, String LoaiDat, double DienTich)
    {
        this.MaGiaoDich = MaGiaoDich;
        this.NgayGiaoDich = NgayGiaoDich;
        this.DonHGia = DonHGia;
        this.LoaiDat = LoaiDat;
        this.DienTich = DienTich;
    }
    public String getMaGiaoDich()
    {
        return MaGiaoDich;
    }
    public void setMaGiaoDich()
    {
        this.MaGiaoDich = MaGiaoDich;
    }
    public LocalDate getNgayGiaoDich()
    {
        return NgayGiaoDich;
    }
    public void setNgayGiaoDich()
    {
        this.NgayGiaoDich = NgayGiaoDich;
    }
    public double getDonHGia()
    {
        return DonHGia;
    }
    public void setDonHGia()
    {
        this.DonHGia = DonHGia;
    }
    public String getLoaiDat()
    {
        return LoaiDat;
    }
    public void setLoaiDat()
    {
        this.LoaiDat = LoaiDat;
    }
    public double getDienTich()
    {
        return DienTich;
    }
    public void setDienTich()
    {
        this.DienTich = DienTich;
    }


}
