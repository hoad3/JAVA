package baitaptrenlop;

public class Hinhhoc {
    public final float PI = 3.14f;
    public String ten;
    public float Chuvi;
    public float Dientich;
    public float Thetich;
    public Hinhhoc()
    {}
    public String getTen()
    {
        return ten;
    }
    public void setTen(String ten)
    {
        this.ten = ten;
    }
    public float getChuvi()
    {
        return Chuvi;
    }
    public void setChuvi(float Chuvi)
    {
        this.Chuvi = Chuvi;
    }
    public float getDientich()
    {
        return Dientich;
    }
    public void setDientich(float Dientich)
    {
        this.Dientich = Dientich;
    }
    public float getThetich()
    {
        return Thetich;
    }
    public void setThetich(float Thetich)
    {
        this.Thetich = Thetich;
    }
    public void XuatTen()
    {
        System.out.println("hinh" + ten);
    }
    public void inChuvi()
    {
        System.out.println("chu vi =" + Chuvi);
    }
    public void inDientich()
    {
        System.out.println("dien tich =" + Dientich);
    }
    public void inThetich()
    {
        System.out.println("the tich =" + Thetich);
    }

}
