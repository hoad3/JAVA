import java.time.LocalDate;

public class QL_GiaoDichNha extends GiaoDichNha
{
    public double ThanhTien;
    public String LoaiNha;
    public String NhaCaoCap;
    public String NHaLoaiThuong;
    public QL_GiaoDichNha()
    {

    }
    public QL_GiaoDichNha(String MaGiaoDich, String NgayGiaoDich,
                          double DonHGia, String LoaiNha, double DienTich,
                          double ThanhTien, String NhaCaoCap, String NHaLoaiThuong)

    {
        super( MaGiaoDich, LocalDate.parse(NgayGiaoDich), DonHGia, LoaiNha, DienTich);
        this.ThanhTien = ThanhTien;
        this.LoaiNha = LoaiNha;
        this.NhaCaoCap = NhaCaoCap;
        this.NHaLoaiThuong = NHaLoaiThuong;
    }
    public double getThanhTien()
    {
        return ThanhTien;
    }
    public  void setThanhTien()
    {
        this.ThanhTien = ThanhTien;
    }
    public String getLoaiNha()
    {
        return LoaiNha;
    }
    public void setLoaiNha()
    {
        if(this.LoaiNha == NhaCaoCap )
        {
            ThanhTien = DienTich * DonHGia;
        }
        else if (this.LoaiNha == NHaLoaiThuong)
        {
            ThanhTien = DienTich * DonHGia * (90/100);
        }

    }
    public String getNhaCaoCap()
    {
        return NhaCaoCap;
    }
    public void setNhaCaoCap()
    {
        this.NhaCaoCap = NhaCaoCap;
    }
    public String getNHaLoaiThuong()
    {
        return NhaCaoCap;
    }
    public void setNHaLoaiThuong()
    {
        this.NHaLoaiThuong = NHaLoaiThuong;
    }
    public void Nhap_Nha()
    {
        System.out.println("nhap vao Ma giao dich: ");
        MaGiaoDich = scanner.nextLine();
        System.out.println("nhap vao ngay giao dich: ");
        this.NgayGiaoDich = LocalDate.parse(scanner.nextLine());
        System.out.println("nhap vao don gia: ");
        DonHGia = scanner.nextDouble();
        System.out.println("nhap vao loai Nha: ");
        LoaiNha = scanner.nextLine();
        System.out.println("nhap vao dien tich: "+"vuong");
        DienTich = scanner.nextDouble();
    }
    public void ThanhTien()
    {
        if(LoaiNha.equals("B")|| LoaiNha.equals("C"))
        {
            ThanhTien = DienTich * DonHGia;
        }
        else if(LoaiNha.equals("A"))
        {
            ThanhTien = DienTich * DonHGia * 1.5;
        }
        System.out.println("\nso tien giao dich cua dat loai " + LoaiNha + " la: " + ThanhTien);

    }
    public void Xuat_Nha()
    {
        System.out.printf("\n%-26s %-26s %-26s %-26s %26s %26s %26s", this.MaGiaoDich, this.NgayGiaoDich, this.DonHGia, this.LoaiNha, this.DienTich);
    }
    public void KiemTraThongTin()
    {
        this.NgayGiaoDich.isAfter(LocalDate.now());
    }


}
