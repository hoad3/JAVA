package Bai1;
import java.util.Scanner;

public class SanPham {
     private String tenSp ;
     private double donGia ;
     private double giamGia ;

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia, double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSp, double donGia){
        this(tenSp, donGia,0);
    }

     private double getThueNhapKhau(double donGia){
        return this.donGia *0.1 ;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public  void nhap(){
        Scanner tsp = new Scanner(System.in);
        System.out.println("vui long nhap ten san pham : ");
        tenSp = tsp.nextLine();
        Scanner dg = new Scanner(System.in);
        System.out.println("nhap don gia cua ban :");
        donGia = dg.nextDouble();
        System.out.println("nhap giam gia don hang :");
        Scanner gg = new Scanner(System.in);
        giamGia = gg.nextDouble();
    }
    public void xuat(){
        System.out.println("Ten San Pham:"+ tenSp );
        System.out.println("Don Gia SP :"+ donGia );
        System.out.println("Giam Gia SP :"+ giamGia );
        System.out.println("Thue cua SP la :"+ getThueNhapKhau(donGia));
        System.out.println("-----------------------------------------");
    }
}
