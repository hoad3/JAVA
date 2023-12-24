import java.util.Scanner;

public class PhongLyThuyet extends PhongHoc
{
    public boolean MayChieu;
    public PhongLyThuyet()
    {

    }
    public PhongLyThuyet(String MaPhong, String DayNha, double DienTich, int SoBongDen, boolean MayChieu)
    {


        this.MayChieu = MayChieu;

    }
    public boolean getMayChieu()
    {
        return MayChieu;
    }
    public void setMayTinh()
    {
        this.MayChieu = MayChieu;
    }
    public void NhapLT()
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
        System.out.println("nhap vao so may chieu: ");
        MayChieu = scanner.hasNextBoolean();
    }

    public void KiemTraPhong()
    {
        if(SoBongDen > 1 && DienTich > 10 && MayChieu == true )
        {
            System.out.println("phong dat chuan");
        }
        else
        {
            System.out.println("phong khong dat chuan");
        }
    }
    public void XuatLT()
    {

        System.out.printf("\n%15s | %15s | %15s | %15d | %15s", this.MaPhong, this.DayNha, this.DienTich, this.SoBongDen, this.MayChieu);
    }



}
