import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng thực phẩm
        HangThucPham sp1 = new HangThucPham("SP001", "Hamburger", 15000, "10/10/2022", "20/10/2022");
        HangThucPham sp2 = new HangThucPham("SP002", "", -5000, "10/10/2022", "20/10/2022");
        HangThucPham sp3 = new HangThucPham("", "Soda", 12000, "20/10/2023", "");

        // Kiểm tra các ràng buộc
        if (!sp2.isTenHangValid()) {
            System.out.println("Tên hàng không được để trống. Sẽ được đặt mặc định là \"XXX\"");
        }
        if (sp2.isDonGiaValid()) {
            System.out.println("Đơn giá không hợp lệ. Sẽ được đặt mặc định là 0");
        }
        if (!sp3.isMaHangValid()) {
            System.out.println("Mã hàng không được để trống. Không thể tạo đối tượng");
            return;
        }
        if (!sp3.isNgayHetHanValid()) {
            System.out.println("Ngày hết hạn không hợp lệ. Sẽ được đặt mặc định là ngày sản xuất");
        }

        // In ra bảng thông tin các sản phẩm
        DecimalFormat df = new DecimalFormat("#,###");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.format("%-10s %-20s %-20s %-20s %-20s %-20s\n", "Mã hàng", "Tên hàng", "Đơn giá", "Ngày sản xuất", "Ngày hết hạn", "Hết hạn?");
        System.out.println("====================================================================================================");
        System.out.format("%-10s %-20s %-20s %-20s %-20s %-20s\n", sp1.getMaHang(), sp1.getTenHang(), df.format(sp1.getDonGia()), sdf.format(sp1.getNgaySanXuat()), sdf.format(sp1.getNgayHetHan()), sp1.isHetHan() ? "Có" : "Không");
        System.out.format("%-10s %-20s %-20s %-20s %-20s %-20s\n", sp2.getMaHang(), sp2.getTenHang(), df.format(sp2.getDonGia()), sdf.format(sp2.getNgaySanXuat()), sdf.format(sp2.getNgayHetHan()), sp2.isHetHan() ? "Có" : "Không");
        System.out.format("%-10s %-20s %-20s %-20s %-20s %-20s\n", sp3.getMaHang(), sp3.getTenHang(), df.format(sp3.getDonGia()), sdf.format(sp3.getNgaySanXuat()), sdf.format(sp3.getNgayHetHan()), sp3.isHetHan() ? "Có" : "Không");
    }
}