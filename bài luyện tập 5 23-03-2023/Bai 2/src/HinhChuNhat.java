public class HinhChuNhat extends Hinh
{
    public float Dai = 3.0F;
    public float Rong = 6.0F;
    public HinhChuNhat()
    {
        this.Dai = Dai;
        this.Rong = Rong;
    }
    public float getDai()
    {
        return Dai;
    }
    public void setDai()
    {
        this.Dai = Dai;
    }
    public float getRong()
    {
        return Rong;
    }
    public void setRong()
    {
        this.Rong = Rong;
    }

    @Override
    public double DientichHCN()
    {
        System.out.println("\nDien tich hinh chu nhat = " + (Dai * Rong));
        return 0;
    }
    @Override
public String toString() {
    return "chieu dai HCN = " + this.Dai +
            ", chieu rong HCN = " + this.Rong + ", dien tich HCN = " + DientichHCN();
}
}
