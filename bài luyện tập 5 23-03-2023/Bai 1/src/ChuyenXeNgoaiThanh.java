public class ChuyenXeNgoaiThanh extends ChuyenXe
{
    public String noiden = "Dong Nai";
    public int Songaydiduoc = 12;
    public float ChuyenXeNgoaiThanh;

    public ChuyenXeNgoaiThanh(int MaSoCHuyen, String HoTenTaiXe, String SoXe, String noiden, int Songaydiduoc) {
        this.MaSoChuyen = MaSoCHuyen;
        this.HoTenTaiXe = HoTenTaiXe;
        this.SoXe = SoXe;
    }

    @Override
    public void XuatThongTin() {
        System.out.println("\nMaSoCHuyen: " + this.MaSoChuyen + "\nHoTenTaiXe: " + this.HoTenTaiXe +
                "\nSoXe: " + this.SoXe + "\nnoi den: " + this.noiden + "\nso ngay di duoc: " + this.Songaydiduoc);
    }
}