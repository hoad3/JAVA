package Bai1;

import static Bai1.SanPham.*;

public class Main {
    public static void main (String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2  = new SanPham();
        sp1.nhap();
        sp1.xuat();
        sp2.nhap();
        sp2.xuat();
    }
}
