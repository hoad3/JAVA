public class Car extends Vehicle {
    public String Run;
    public void methodCar()
    {
        Run = "100km";
        color = "red";
        Model = "xe 4 banh";
    }
    public void XuatCar()
    {
        System.out.println("toc do=" + Run);
        System.out.println("color=" + color);
        System.out.println("Model="+ Model);
    }
    public Car( String color,String Model, String Run )
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
