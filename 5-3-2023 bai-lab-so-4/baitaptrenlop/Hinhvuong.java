package baitaptrenlop;

import java.util.Scanner;

public class Hinhvuong extends Hinhhoc {
    public float Canh;
    public Hinhvuong()
    {
        ten = "hinh Vuong";
    }
    public void NhapvaoCanh()
    {
        System.out.println("nhap vao chieu dai");
        Scanner scanner = new Scanner(System.in);
        Canh = scanner.nextFloat();
    }
    public void Tinhchuvi()
    {
        Chuvi = Canh*4;
    }
    public void Tinhdientich()
    {
        Dientich = Canh * Canh;
    }
}
