public class ChuyenXe
{
    public int MaSoChuyen;
    public String HoTenTaiXe;
    public String SoXe;
    public float DoanhThu;

    public ChuyenXe() {
    }

    public void ChuyenXe() {
    }

    public float DoanhThuCHuyenXeNoiThanh() {
        float DoanhThu = 230000.7F;
        System.out.println("\nDoanh Thu cua xe noi thanh la:" + DoanhThu);
        return DoanhThu;
    }

    public float DoanhThuXeNgoaiThanh() {
        float DoanhThu = 453000.42F;
        System.out.println("\nDoanh thu xe ngoai thanh la: " + DoanhThu);
        return DoanhThu;
    }

    public Float TongDoanhThu() {
        System.out.println("\nTong doanh thu la:");
        float DoanhThu = this.DoanhThuXeNgoaiThanh() + this.DoanhThuCHuyenXeNoiThanh();
        return DoanhThu;
    }

    public void XuatThongTin() {
    }
}
