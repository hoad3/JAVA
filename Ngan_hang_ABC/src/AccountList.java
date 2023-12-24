import java.util.ArrayList;
import java.util.Scanner;
public class AccountList {
    ArrayList <Account> acc ;
    int count ;
    public AccountList() {
        acc = new ArrayList<Account>(10);
        count = 0;
    }
    public AccountList(int n){
        if (n > 0) {
            acc = new ArrayList<Account>(n);
        } else {
            acc = new ArrayList<Account>(10);
            count = 0;
        }
    }
    public void themTK(Account a) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so luong can them :");
        int n = sc.nextInt();
        for (int i = 1; i<= n; i++){
            System.out.println("Lan nhap thu " + i);
            a = new Account();
            Scanner b = new Scanner(System.in);
            System.out.println("Nhap so tai khoan: ");
            long soTK = b.nextLong();
            a.setSo_Tai_Khoan(soTK);
            b.nextLine();
            System.out.println("Nhap ten tai khoan: ");
            String tenTK = b.nextLine();
            a.setTen_Tai_Khoan(tenTK);
            System.out.println("Nhap so tien: ");
            double soTien = b.nextDouble();
            a.setSoTien(soTien);
            acc.add(a);
        }
    }
    public void timTK(long soTK) {
        for (int i = 0; i < count; i++) {
            if (acc.get(i).getSo_Tai_Khoan() == soTK) {
                System.out.println(acc.get(i).toString());
            }
        }
    }
    public void xoaTK(long soTK) {
        System.out.println("Nhap so tai khoan can xoa: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (acc.get(i).getSo_Tai_Khoan() == soTK) {
                acc.remove(i);
                count--;
                System.out.println("Da xoa thanh cong");
            }
        }
    }
    public int demTK() {
        return acc.size();
    }
    public void inTK() {
        for (Account a : acc) {
            System.out.println(a.toString());
        }
    }
    public void napTien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can nap tien: ");
        long soTK = sc.nextLong();
        System.out.println("Nhap so tien can nap: ");
        double soTien = 0;
        do {
            soTien = sc.nextDouble();
            if (soTien <= 0) {
                System.out.println("So tien khong hop le, vui long nhap lai: ");
            }
        } while (soTien <= 0);
        for (int i = 0; i < acc.size(); i++) {
            Account a = acc.get(i);
            if (a.getSo_Tai_Khoan() == soTK) {
                a.setSoTien(a.getSoTien() + soTien);
                System.out.println("Da nap tien thanh cong");
            } else if (a.getSo_Tai_Khoan() != soTK) {System.out.println("Khong tim thay STK nay !");
            }

        }

    }
    public void rutTien(){
        Scanner c = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can rut tien: ");
        long soTK = c.nextLong();
        System.out.println("Nhap so tien can rut: ");
        double soTien = 0;
        do {
            soTien = c.nextDouble();
            if (soTien <= 0) {
                System.out.println("So tien khong hop le, vui long nhap lai: ");
            }
        } while (soTien <= 0);
        for ( int i = 0; i < acc.size(); i++){
            Account a = acc.get(i);
            if (a.getSo_Tai_Khoan() == soTK){
                if (a.getSoTien() >= soTien){
                    a.setSoTien(a.getSoTien() - soTien);
                    System.out.println("Da rut tien thanh cong");
                } else {
                    System.out.println("So tien khong du de rut");
                }
            }
            else if (a.getSo_Tai_Khoan() != soTK) {
                System.out.println("Khong tim thay STK nay !");
            }
        }

    }
    public void chuyenTien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can chuyen: ");
        long soTK = sc.nextLong();
        System.out.println("Nhap so tien can chuyen: ");
        double soTien = sc.nextDouble();
        System.out.println("Nhap so tai khoan nhan: ");
        long soTKNhan = sc.nextLong();
        do {
            if (soTien <= 0) {
                System.out.println("So tien khong hop le, vui long nhap lai: ");
            }
        } while (soTien <= 0);
        for ( int i = 0; i < acc.size() ; i++){
            Account a = acc.get(i);
            if (a.getSo_Tai_Khoan() == soTK){
                if (a.getSoTien() >= soTien){
                    a.setSoTien(a.getSoTien() - soTien);
                    System.out.println("Da chuyen tien thanh cong");
                }
            }
        }
        for ( int i = 0; i < acc.size() ; i++){
            Account a = acc.get(i);
            if (a.getSo_Tai_Khoan() == soTKNhan){
                a.setSoTien(a.getSoTien() + soTien);
                return;
            }
            else if (a.getSo_Tai_Khoan() != soTKNhan) {
                System.out.println("Khong tim thay STK nay !");
            }
        }
    }
    public void menu(){
        System.out.println("\n--------QUAN LY TAI KHOAN--------\n"+
                "1. Them tai khoan\n"+
                "2. So tai khoan hien co\n"+
                "3. In thong tin tai khoan\n"+
                "4. Nap tien vao tai khoan\n"+
                "5. Rut tien tu tai khoan\n"+
                "6. Chuyen tien\n"+
                "7. Thoat\n");
    }

}