public class Bicycle extends Vehicle
{
    public String Run;
    public void methodBicycle()
    {
        Run = "20km";
        color = "Blue";
        Model = "xe 2 banh";
    }
    public void xuatBicycle()
    {
        System.out.println("toc do=" + Run);
        System.out.println("color=" + color);
        System.out.println("Model="+ Model);
    }
    public Bicycle( String color,String Model, String Run )
    {
        super(color, Model);
        this.Run = Run;
    }
    public String getRun()
    {
        return Run;
    }
    public void setRun()
    {
        this.Run = Run;
    }
}
