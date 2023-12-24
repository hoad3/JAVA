import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Data
{
    ArrayList<Dang_ky_xe> DKX = new ArrayList();
    public Data()
    {
        DKX = new ArrayList<>();
    }
    public void DS(Dang_ky_xe a)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong can them: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println("nhap vao lan thu " + (i+1) + ": ");
            if (a instanceof Dang_ky_xe)
            {
                a = new Dang_ky_xe();
                a.Nhap();
            }
            DKX.add(a);
        }
    }
    public void hide()
    {
        for (Dang_ky_xe x : DKX)
        {
            if (x instanceof Dang_ky_xe)
            {
                x.Xuat();
            }
        }
    }
}
