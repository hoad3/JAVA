import java.util.Scanner;

public class PhongThiNgiem extends PhongHoc
{
    public int SucChua;
    public boolean BonRua;
    public PhongThiNgiem()
    {

    }

    public PhongThiNgiem(String MaPhong, String DayNha, double DienTich, int SoBongDen, int SucChua, boolean BonRua)
    {
        super(MaPhong, DayNha, DienTich, SoBongDen);
        this.SucChua = SucChua;
        this.BonRua = BonRua;

    }
    public int getSucChua()
    {
        return SucChua;
    }
    public void setSucChua()
    {
        this.SucChua = SucChua;
    }

    public boolean getBonRua()
    {
        return BonRua;
    }
    public void setBonRua()
    {
        this.BonRua = BonRua;
    }

    public void NhapTN()
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
        System.out.println("nhap vao suc chua: ");
        SucChua = scanner.nextInt();
        System.out.println("Nhap vao bon rua:: ");
        BonRua = scanner.hasNextBoolean();
    }
    public void KiemTraPhong()
    {
        if(SoBongDen > 1 && DienTich > 10 && BonRua == true )
        {
            System.out.println("phong dat chuan");
        }
        else
        {
            System.out.println("phong khong dat chuan");
        }
    }
    public void XuatTN()
    {
        System.out.printf("\n%15s | %15s | %15s | %15d | %15d | %15s", this.MaPhong, this.DayNha, this.DienTich, this.SoBongDen, this.SucChua, this.BonRua);
    }
}
