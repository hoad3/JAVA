public class PhongHoc
{
    public String MaPhong;
    public String DayNha;
    public double DienTich;
    public int SoBongDen;
    public PhongHoc()
    {

    }
    public PhongHoc(String MaPhong, String DayNha, double DienTich, int SoBongDen)
    {
        this.MaPhong = MaPhong;
        this.DayNha = DayNha;
        this.DienTich = DienTich;
        this.SoBongDen = SoBongDen;
    }
    public String getMaPhong()
    {
        return MaPhong;
    }
    public void setMaPhong()
    {
        this.MaPhong = MaPhong;
    }
    public String getDayNha()
    {
        return DayNha;
    }
    public void setDayNha()
    {
        this.DayNha = DayNha;
    }
    public double getDienTich()
    {
        return DienTich;
    }
    public void setDienTich()
    {
        this.DienTich = DienTich;
    }
    public int getSoBongDen()
    {
        return SoBongDen;
    }
    public void setSoBongDen()
    {
        this.SoBongDen = SoBongDen;
    }

}
