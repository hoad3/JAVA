import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy QL = new QuanLy();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        do {
            System.out.println("\n----- Quản lý phòng học -----");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Xem thông tin phòng học");
            System.out.println("3. Xóa thông tin phòng học");
            System.out.println("4. xap xep thu tu day nha");
            System.out.println("5. xap xep theo cot dien tich");
            System.out.println("6. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng phòng học cần thêm: ");
                    int n = scanner.nextInt();
                    QL.ThemPhongHoc();
                    break;
                case 2:
                    System.out.println("Danh sách thông tin phòng học:");
                    QL.XemThongTin();
                    break;
                case 3:
                    System.out.print("Nhập mã phòng cần xóa: ");
                    String maPhong = scanner.next();
                    QL.XoaThongTinPhong(maPhong);
                    System.out.println("Thông tin phòng đã được xóa.");
                    break;
                case 4:
                    QL.XapXep_DayNha();
                    System.out.println("ket qua sau khi sap xep");
                    QL.XemThongTin();
                    break;
                case 5:
                    QL.SapXepGiamTheoDienTich();
                    System.out.println("ket qua sau khi sap xep la");
                    QL.XemThongTin();
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        } while (isRunning);

        System.out.println("Chương trình đã kết thúc.");
    }
}