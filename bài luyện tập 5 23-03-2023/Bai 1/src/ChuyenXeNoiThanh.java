public class ChuyenXeNoiThanh extends ChuyenXe {
    public String SoTuyen = "tuyen_02";
    public String KmDiDuoc = "200Km";

    public ChuyenXeNoiThanh(int MaSoCHuyen, String HoTenTaiXe, String SoXe, String SoTuyen, String kmDiDuoc) {
        this.MaSoChuyen = MaSoCHuyen;
        this.HoTenTaiXe = HoTenTaiXe;
        this.SoXe = SoXe;
    }

    @Override
    public void XuatThongTin() {
        System.out.println("\nMaSoCHuyen: " + this.MaSoChuyen + "\nHoTenTaiXe: " + this.HoTenTaiXe +
                "\nSoXe: " + this.SoXe + "\nSo tuyen: " + this.SoTuyen + "\nSo KM di duoc: " + this.KmDiDuoc);
    }
}