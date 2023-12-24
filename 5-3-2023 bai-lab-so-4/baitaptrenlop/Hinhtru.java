package baitaptrenlop;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float Chieucao;
    public Hinhtru()
    {
        ten = "hinh Tru";
    }
    public void nhapChieucao()
    {
        System.out.println("nhap vao chieu cao");
        Scanner scanner = new Scanner(System.in);
        Chieucao = scanner.nextFloat();
    }
    public void Tinhthetich()
    {
        Thetich = Chieucao * Dientich;
    }

}
