import java.util.Scanner;

public class HangHoa
{
    private String Mahang, Tenhang;
    private int SoLuongTonKho;
    private int DonGia;

    public HangHoa()
    {

    }
    public HangHoa(String Mahang, String Tenhang, int SoLuongTonKho, int DonGia)
    {
        this.Mahang = Mahang;
        this.Tenhang = Tenhang;
        this.SoLuongTonKho = SoLuongTonKho;;
        this.DonGia = DonGia;

    }
    public String getMahang() {
        return this.Mahang;
    }
    public String getTenhang() {
        return this.Tenhang;
    }
    public void setMahang(String maHang) {
        this.Mahang = maHang;
    }
    public void setTenhang(String tenHang){
        this.Tenhang = tenHang;
    }
    public int getSoLuongTonKho() {
        if ( this.getSoLuongTonKho() <= 10)
            return 0;
        return this.SoLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        this.SoLuongTonKho = soLuongTonKho;
    }
    public double getDonGia() {
        if (this.DonGia < 0){
            return 0;
        }
        return this.DonGia;
    }
    public void setDonGia(int donGia) {
        this.DonGia = donGia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        this.Mahang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        this.Tenhang = sc.nextLine();
        System.out.println("Nhap so luong ton kho: ");
        this.SoLuongTonKho = sc.nextInt();
        System.out.println("Nhap don gia: ");
        this.DonGia = sc.nextInt();
    }
    public void xuat(){
        System.out.printf("\n%-26s %-26s %-26s %-26s", this.Mahang, this.Tenhang, this.SoLuongTonKho, this.DonGia);
    }
}
