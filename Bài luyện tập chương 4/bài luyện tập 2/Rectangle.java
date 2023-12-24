import java.util.Scanner;

public class Rectangle extends shape {
    public double width = 3.0;
    public double length = 2.0;
    public void tenRectangle()
    {
        Ten ="Rectangle";
    }
    public void AreaRectangle()
    {
        Area = width * length;
    }
    public void primeterRectangle()
    {
        primeter = (width + length)*2;
    }
    public void xuatRectangle()
    {
        System.out.println("Ten="+ Ten);
        System.out.println("color="+ color);
        System.out.println("fille="+filled);
        System.out.println("Area=" + Area);
        System.out.println("perimeter="+ primeter);
    }

public Rectangle( String color, String Ten, Boolean filled, double width, double length)
{
    super( color, Ten, filled);
    this.width =width;
    this.length = length;
}
    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }




    }



