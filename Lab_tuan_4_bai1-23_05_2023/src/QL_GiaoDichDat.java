import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QL_GiaoDichDat extends GiaoDichDat
{
    public double ThanhTien;
    public String A;
    public String B;
    public String C;
    public QL_GiaoDichDat()
    {}
    public QL_GiaoDichDat(String MaGiaoDich, String NgayGiaoDich, double DonHGia,
                          String LoaiDat, double DienTich, double ThanhTien,
                            String Loai_A, String Loai_B, String Loai_C)
    {
        super( MaGiaoDich, LocalDate.parse(NgayGiaoDich), DonHGia, LoaiDat, DienTich);
        this.ThanhTien = ThanhTien;
        this.A = A;
        this.B = B;
        this.C = C;
    }




    public void Nhap_Dat()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("nhap vao Ma giao dich: ");
        MaGiaoDich = scanner.nextLine();
        System.out.println("Nhập vào ngày giao dịch: ");
        String ngayGiaoDichString = scanner.nextLine();
        LocalDate ngayGiaoDich = LocalDate.parse(ngayGiaoDichString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.NgayGiaoDich = ngayGiaoDich;
        System.out.println("nhap vao don gia: ");
        DonHGia = scanner.nextDouble();
        System.out.println("nhap vao loai dat: ");
        LoaiDat = scanner.nextLine();
        LoaiDat = scanner.nextLine();
        System.out.println("nhap vao dien tich: "+"vuong");
        DienTich = scanner.nextDouble();
    }
        public double getThanhTien()
    {
        return ThanhTien;
    }
        public void setThanhTien()
    {
        this.ThanhTien = ThanhTien;
    }
    public void ThanhTien()
    {
        if(LoaiDat.equals("B")|| LoaiDat.equals("C"))
        {
            ThanhTien = DienTich * DonHGia;
        }
        else if(LoaiDat.equals("A"))
        {
            ThanhTien = DienTich * DonHGia * 1.5;
        }
        System.out.println("\nso tien giao dich cua dat loai " + LoaiDat + " la: " + ThanhTien);

    }
    public void Xuat_Dat()
    {
        System.out.printf("\n%-26s %-26s %-26s %-26s %26s", this.MaGiaoDich, this.NgayGiaoDich, this.DonHGia, this.LoaiDat, this.DienTich);

    }
    public void KiemTraThongTin()
    {
        this.NgayGiaoDich.isAfter(LocalDate.now());
    }

}
