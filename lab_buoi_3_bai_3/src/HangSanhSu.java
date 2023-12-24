import java.time.LocalDate;
import java.util.Scanner;

public class HangSanhSu extends HangHoa
{
    private LocalDate NgayNhapKho;
    private String NhaCungCap;
    public HangSanhSu()
    {

    }
    public HangSanhSu(String Mahang, String Tenhang, int SoLuongTonKho, int DonGia, LocalDate NgayNhapKho, String NhaCungCap)
    {
        this.NgayNhapKho = NgayNhapKho;
        this.NhaCungCap = NhaCungCap;
    }
    public LocalDate getNgayNhapKho()
    {
        return NgayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho)
    {
        this.NgayNhapKho = ngayNhapKho;
    }
    public String getNhaSanXuat()
    {
        return NhaCungCap;
    }
    public void setNhaSanXuat()
    {
        this.NhaCungCap = NhaCungCap;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ngay nhap kho: ");
        this.NgayNhapKho = LocalDate.parse(sc.nextLine());
        System.out.println("Nhap nha san xuat: ");
        this.NhaCungCap = sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("%-15s %-15s", this.NhaCungCap, this.NhaCungCap);
    }
    public void KiemTraHangHoa(){
        if ( this.getSoLuongTonKho() > 50 && this.getNgayNhapKho().compareTo(LocalDate.now()) > 10 ){
            System.out.println("Hang co the khong ban duoc");
        }
        else {
            System.out.println("Hang co kha nang ban duoc");
        }

    }
}
