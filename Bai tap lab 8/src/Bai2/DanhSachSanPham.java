package Bai2;

import Bai1.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachSanPham {
    List<SanPham> ds = new ArrayList<>();
    public void nhap(){
        SanPham sp = new SanPham();
        sp.nhap();
        ds.add(sp);
    }
    public void xuat(){
        for (int i = 0; i < ds.size(); i++){
            SanPham sp = ds.get(i);
            sp.xuat();
        }
    }
    public void xoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        String ten = scanner.nextLine();
        for (int i = 0; i < ds.size(); i++){
            SanPham sp = new SanPham();
            if (sp.getTenSp().equals(ten)){
                ds.remove(i); break;
            }
        }
    }
}
