package baitaptrenlop;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc{
    public float Bankinh;
    public Hinhtron()
    {
        ten = "tron";
    }
    public void NhapBankinh()
    {
        System.out.println("nhap vao ban kinh");
        Scanner scanner = new Scanner(System.in);
        Bankinh = scanner.nextFloat();
    }
    public void Tinhchuvi()
    {
        Chuvi = 2*PI*Bankinh;
    }
    public void Tinhdientich()
    {
        Dientich = PI*Bankinh*Bankinh;
    }
}
