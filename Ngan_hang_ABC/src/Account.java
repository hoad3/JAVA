import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private long So_Tai_Khoan;
    private String Ten_Tai_Khoan;
    private double soTien;
    private String trangThai;
    final double laiSuat = 0.035;
    Locale local = new Locale("vi", "vn");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
    public Account() {
        long soTK = 999999;
        String tenTK = " Chua xac dinh ";
        double soTien = 50;
        String trangThai = "";
    }
    public Account(long soTK, String tenTK, double soTien, String trangThai) {
        this.So_Tai_Khoan = soTK;
        this.Ten_Tai_Khoan = tenTK;
        this.soTien = soTien;
        this.trangThai = trangThai;
    }
    public long getSo_Tai_Khoan() {
        return So_Tai_Khoan;
    }
    public void setSo_Tai_Khoan(long soTK) {
        if (soTK > 0 && soTK != 999999) {
            this.So_Tai_Khoan = soTK;
        } else {
            this.So_Tai_Khoan = 999999;
            System.out.println("So tai khoan khong hop le");
        }
    }
    public String getTen_Tai_Khoan() {
        return Ten_Tai_Khoan;
    }
    public void setTen_Tai_Khoan(String tenTK) {
        if (tenTK != null) {
            this.Ten_Tai_Khoan = tenTK;
        } else {
            this.Ten_Tai_Khoan = "Chua xac dinh";
            System.out.println("Ten tai khoan khong hop le");
        }
    }
    public double getSoTien() {
        return soTien;
    }
    public void setSoTien(double soTien) {
        if (soTien >= 50) {
            this.soTien = soTien;
        } else {
            this.soTien = 50;
            System.out.println("So tien khong hop le");
        }
    }
    public String getTrangThai() {
        return trangThai;
    }
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public Account (long soTK, String tenTK){
        this.So_Tai_Khoan = soTK;
        this.Ten_Tai_Khoan = tenTK;
        this.soTien = 50;
    }
    public void napTien(double soTien){
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can nap: ");
        soTien = sc.nextDouble();
        if (soTien > 0) {
            this.soTien += soTien;
        } else {
            System.out.println("So tien khong hop le");
        }

    }
    public void rutTien(double soTien){
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can rut: ");
        soTien = sc.nextDouble();
        if (soTien > 0 && soTien <= this.soTien) {
            this.soTien -= soTien;
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    public void chuyenKhoan(Account account, double soTien){
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can chuyen: ");
        soTien = sc.nextDouble();
        if (soTien > 0 && soTien <= this.soTien) {
            this.soTien -= soTien;
            account.soTien += soTien;
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    public void daoHan(){
        this.soTien = this.soTien + this.soTien * laiSuat;
    }
    public void Xuat()
    {

    }


    @Override
    public String toString() {
        return "[" +
                " soTK ='" + getSo_Tai_Khoan() + "'" +
                ", tenTK ='" + getTen_Tai_Khoan() + "'" +
                ", soTien ='" + getSoTien() + "'" +
                ", trangThai ='" + getTrangThai() + "'" +
                "]";
    }




}




