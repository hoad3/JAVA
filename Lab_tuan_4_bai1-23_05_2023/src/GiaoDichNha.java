import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichNha
{
    public String MaGiaoDich;
    public LocalDate NgayGiaoDich;
    public double DonHGia;
    public String LoaiNha;
    public double DienTich;

    Scanner scanner = new Scanner(System.in);

    public GiaoDichNha()
    {

    }
    public GiaoDichNha (String MaGiaoDich, LocalDate NgayGiaoDich, double DonHGia, String LoaiNha, double DienTich)
    {
        this.MaGiaoDich = MaGiaoDich;
        this.NgayGiaoDich = NgayGiaoDich;
        this.DonHGia = DonHGia;
        this.LoaiNha = LoaiNha;
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
    public String getLoaiNha()
    {
        return LoaiNha;
    }
    public void setLoaiNha()
    {
        this.LoaiNha = LoaiNha;
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

