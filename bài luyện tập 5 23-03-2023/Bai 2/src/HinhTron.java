public  class HinhTron extends Hinh
{

    public float BK = 3.4F;
    public float PI = 3.14F;
    public HinhTron()
    {
        this.BK = BK;
    }
    public float getBK()
    {
        return BK;
    }
    public void setBK()
    {
        this.BK = BK;
    }
    @Override
    public double DientichHT()
    {
        System.out.println("\ndien tich hinh tron ="+ (BK * BK * PI));
        return 0;
    }

    @Override
    public String toString() {
        return "\nBank kinh hinh tron = " + this.BK +
                ", diện tích = " + DientichHT();
    }

}

