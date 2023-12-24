package baitaptrenlop;

import java.util.Scanner;

public class HinhCN extends Hinhhoc {
    public float Dai;
    public float Rong;
    public HinhCN()
    {
        ten = "hinh chu nhat";
    }
    public void NhapvaoDaivaRong()
    {
        System.out.println("nhap vao chieu dai");
        Scanner scanner = new Scanner(System.in);
        Dai = scanner.nextFloat();
        System.out.println("nhap vao chieu rong");
        Scanner scanner1 = new Scanner(System.in);
        Rong = scanner.nextFloat();
    }
    public void Tinhchuvi()
    {
        Chuvi = (Dai + Rong) * 2;
    }
    public void Tinhdientich()
    {
        Dientich = Dai * Rong;
    }
}
