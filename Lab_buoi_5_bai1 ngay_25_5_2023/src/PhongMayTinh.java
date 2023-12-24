import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhongMayTinh extends PhongHoc
{
    public int MayTinh;
    public PhongMayTinh()
    {

    }
    public PhongMayTinh(String MaPhong, String DayNha, double DienTich, int SoBongDen, int MayTinh)
    {
        super(MaPhong, DayNha, DienTich, SoBongDen);
        this.MayTinh = MayTinh;
    }
    public int getMayTinh()
    {
        return MayTinh;
    }
    public void setMayTinh()
    {
        this.MayTinh = MayTinh;
    }

    public void NhapMT()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ma phong: ");
        MaPhong = scanner.nextLine();
        System.out.println("nhap vao day nha: ");
        DayNha = scanner.nextLine();
        System.out.println("nhap vao dien tich: ");
        DienTich = scanner.nextDouble();
        System.out.println("nhap vao so bong den: ");
        SoBongDen = scanner.nextInt();
        System.out.println("nhap vao so may tinh: ");
        MayTinh = scanner.nextInt();
    }

    public void KiemTraPhong()
    {
        if(SoBongDen > 1 && DienTich > 10 && MayTinh >= 1.5 )
        {
            System.out.println("phong dat chuan");
        }
        else
        {
            System.out.println("phong khong dat chuan");
        }
    }
    public void XuatMT()
    {
        DecimalFormat D = new DecimalFormat("###.## m^2");
        System.out.printf("\n%15s | %15s | %15s | %15d | %15s", this.MaPhong, this.DayNha, this.DienTich, this.SoBongDen, this.MayTinh);
    }

    public void ThemMayTinh(int mayTinh) {
    }
}
