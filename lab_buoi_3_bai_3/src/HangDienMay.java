public class HangDienMay extends HangHoa {
    private int BaoHanh;
    private double CongSuat;

    private double ThueVAT = 10/100;
    public HangDienMay() {

    }

    public HangDienMay(String Mahang, String Tenhang, int SoLuongTonKho, int DonGia, int BaoHanh, double CongSuat) {
        super(Mahang, Tenhang, SoLuongTonKho, DonGia);
        this.BaoHanh = BaoHanh;
        this.CongSuat = CongSuat;

    }

    public int getBaoHanh() {
        return BaoHanh;
    }

    public void setBaoHanh() {
        if (this.BaoHanh < 0) {
            System.out.println("khong hop le! vui long nhap lai");
        } else {
            this.BaoHanh = BaoHanh;
        }
    }

    public double getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat() {
        if (this.CongSuat < 0) {
            System.out.println("khong hop le! vui long nhap lai");
        } else {
            this.CongSuat = CongSuat;
        }

    }
    public double getThueVAT()
    {
        return ThueVAT;
    }
    public void setThueVAT()
    {
        this.ThueVAT = ThueVAT;
    }
    public void KiemTraHangHoa(){
        if (this.getSoLuongTonKho() > 3 ){
            System.out.println("Hang co kha nang ban duoc");
        }
        else {
            System.out.println("Hang khong co kha nang ban duoc");
        }
    }
}
