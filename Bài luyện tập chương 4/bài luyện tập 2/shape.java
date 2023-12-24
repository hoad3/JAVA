import java.awt.geom.Area;

public class shape {
    public String Ten;
    String color = "red";
    public Boolean filled = true;
    public double Area;
    public double primeter;

    public shape(String s, String color, Boolean filled)
    {
        this.color = "Red";
        this.filled = true;
    }

    public String getColor()
    {
        return color;
    }
    public void  setColor()
    {
        this.color = color;
    }
    public Boolean getFilled()
    {
        return filled;
    }
    public void setFilled()
    {
        this.filled = filled;
    }


}
