package Bai1;

import Bai1.HinhTron;
import Bai1.HinhVuong;

public class Main
{
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron(10);
        hinhTron.CV();
        hinhTron.DT();
        float CV = hinhTron.setCV();
        float DT = hinhTron.setDT();
        System.out.println("chu vi hinh tron:" +CV+ "\ndien tich hinh tron:"+DT );
        HinhVuong hinhVuong = new HinhVuong(10);
        hinhVuong.ChuVi();
        hinhVuong.DienTich();
        int ChuVi =  hinhVuong.setChuVi();
        int DienTich = hinhVuong.setDienTich();
        System.out.println("chu vi hinh vuong:" +ChuVi+ "\ndien tich hinh vuong" +DienTich);
    }
}