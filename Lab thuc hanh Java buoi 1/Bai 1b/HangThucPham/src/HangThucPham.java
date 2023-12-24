import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private String MaHang;
    private String TenHang = "XXX";
    private double DonGia = 0;
    private Date NgaySanXuat = new Date();
    private Date NgayHetHan = new Date();

    public HangThucPham(String sp002, String tenHang, int donGia, String s, String s1) {}

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        this.MaHang = maHang;
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    public HangThucPham(String maHang) throws Exception {
        if (maHang.isEmpty()) {
            throw new Exception("error: Ma hang rong!");
        }
        this.MaHang = maHang;
    }

    public String getMaHang() {
        return MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        if (!tenHang.isEmpty()) {
            this.TenHang = tenHang;
        }
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.DonGia = donGia;
        }
    }

    public Date getNgaySanXuat() {
        return NgaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        if (ngaySanXuat.before(new Date())) {
            this.NgaySanXuat = ngaySanXuat;
        }
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan.after(NgaySanXuat)) {
            this.NgayHetHan = ngayHetHan;
        }
    }

    public boolean kiemTraHetHan() {
        Calendar calendar = Calendar.getInstance();
        Date ngayHienTai = calendar.getTime();
        return NgayHetHan.before(ngayHienTai);
    }

    @Override
    public String toString() {
        String strNgayHetHan = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        if (kiemTraHetHan()) {
            strNgayHetHan = "Da het han";
        } else {
            strNgayHetHan = "Con han su dung";
        }

        return "Ma hang: " + MaHang + "\n" +
                "Ten hang: " + TenHang + "\n" +
                "Don gia: " + nf.format(DonGia) + "\n" +
                "Ngay san xuat: " + sdf.format(NgaySanXuat) + "\n" +
                "Ngay het han: " + sdf.format(NgayHetHan) + " (" + strNgayHetHan + ")";
    }

    public boolean isNgayHetHanValid()
    {
        return true;
    }

    public boolean isMaHangValid()
    {
        return true;
    }

    public boolean isDonGiaValid()
    {
        return true;
    }

    public boolean isTenHangValid()
    {
        return true;

    }

    public boolean isHetHan()
    {
        return true;
    }
}
