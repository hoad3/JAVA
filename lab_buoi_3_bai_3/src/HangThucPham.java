import java.time.LocalDate;
import java.util.Scanner;

public class HangThucPham extends HangHoa
{
    private LocalDate NgaySanXuat;
    private LocalDate NgayHetHan;
    private String NhaCungCap;
    private double ThueVAT = 5/100;
    public HangThucPham()
    {

    }
    public HangThucPham(String Mahang, String Tenhang, int SoLuongTonKho, int DonGia, LocalDate NgaySanXuat, LocalDate NgayHeHan, String NhaCungCapm, double ThueVAT)
    {
        super(Mahang, Tenhang, SoLuongTonKho, DonGia );
        this.NgaySanXuat = NgaySanXuat;
        this.NgayHetHan = NgayHetHan;
        this.NhaCungCap = NhaCungCap;
        this.ThueVAT = ThueVAT;
    }

    public LocalDate getNgaySanXuat()
    {
        return NgaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat)
    {
        this.NgaySanXuat = ngaySanXuat;
    }
    public LocalDate getNgayHetHan()
    {
        return NgayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan)
    {
        this.NgayHetHan = ngayHetHan;
    }
    public String getNhaCungCap()
    {
        return NhaCungCap;
    }
    public void setNhaCungCap()
    {
        this.NhaCungCap = NhaCungCap;
    }

    public double getThueVAT()
    {
        return ThueVAT;
    }

    public void setThueVAT(double thueVAT)
    {
        this.ThueVAT = thueVAT;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay san xuat!: ");
        this.NgaySanXuat = LocalDate.parse(sc.nextLine());
        System.out.println("Nhap ngay het han!: ");
        this.NgayHetHan = LocalDate.parse(sc.nextLine());
        System.out.println("Nhap nha cung cap!: ");
        this.NhaCungCap = sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("%-26s %-26s %-26s", this.NgaySanXuat, this.NgayHetHan, this.NhaCungCap);
    }
    public void KiemTraHangHoa(){
        if ( this.getSoLuongTonKho() > 0 && this.NgayHetHan.isAfter(LocalDate.now())) {
            System.out.println("hang khong ban duwoc");
        }
        System.out.println("Hang ban duoc");
    }
}
