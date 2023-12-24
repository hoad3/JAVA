package Lab4;

public class Cylinder extends Circle {
    private double height;
    public Cylinder (double radius, String color,double height)
    {
        super(radius, color);
        this.height = height;
    }
    public double getheight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getvolume()
    {
        return getArea()*height;
    }
}
