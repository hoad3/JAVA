import java.time.LocalDate;

public class HoaDon
{
    public String MaKH;
    public String HoTen;
    public LocalDate NgayRaHD;
    public String DoiTuong;
    public double SoLuong;
    public double DonGia;
    public double DinhMuc = 2500;

    public HoaDon()
    {

    }
    public HoaDon(String MaKH,  String HoTen, LocalDate NgayRaHD,
                  String DoiTuong, double SoLuong, double DonGia,
                  double DinhMuc)
    {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.NgayRaHD = NgayRaHD;
        this.DoiTuong = DoiTuong;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.DinhMuc = DinhMuc;

    }
    public String getMaKH()
    {
        return MaKH;
    }
    public void setMaKH()
    {
        this.MaKH = MaKH;
    }
    public String getHoTen()
    {
        return HoTen;
    }
    public void setHoTen()
    {
        this.HoTen = HoTen;
    }
    public LocalDate getNgayRaHD()
    {
        return NgayRaHD;
    }
    public void setNgayRaHD()
    {
        this.NgayRaHD = NgayRaHD;
    }
    public String getDoiTuong()
    {
        return DoiTuong;
    }
    public void setDoiTuong()
    {
        this.DoiTuong = DoiTuong;
    }
    public double getSoLuong()
    {
        return SoLuong;
    }
    public void setSoLuong()
    {
        this.SoLuong = SoLuong;
    }
    public double getDonGia()
    {
        return DonGia;
    }
    public void setDonGia()
    {
        this.DonGia = DonGia;
    }
    public double getDinhMuc()
    {
        return DinhMuc;
    }
    public void setDinhMuc()
    {
        this.DinhMuc = DinhMuc;
    }


}
