import java.util.Scanner;

public class Camsanh extends Quacam {
public String color = "vang";



public void Camsanh()
{
Tenqua = "Cam sanh";
Giaban = "15k";
Ngaynhap = "20/02/20023";
Soluong = "2 tan";
}
public void xuatCamsanh()
{
System.out.println("mau sac=" + color);
System.out.println("hinh dang="+ Ngaynhap);
System.out.println("tenn qua="+ Tenqua);
System.out.println("ngon goc="+ nguongoc);
System.out.println("gia ban="+ Giaban);

}
public Camsanh(String Tenqua, String nguongoc, String Ngaynhap, String Giaban,String Soluong ,String color )
{
    super(Tenqua, nguongoc,Ngaynhap,Giaban, Soluong);
    this.color = color;

}
public String getColor()
{
    return color;
}
public void setColor()
{
    this.color = color;
}
}
