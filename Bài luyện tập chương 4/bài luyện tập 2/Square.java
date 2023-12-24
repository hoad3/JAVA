public class Square extends Rectangle{
    public double side = 2.0;
    public void tenSquare()
    {
        Ten ="Square";
    }
    public void AreaSquare()
    {
        Area = side*side;
    }
    public void primeterSquare()
    {
        primeter = side*4;
    }
    public void xuatSquare()
    {
        System.out.println("Ten="+ Ten);
        System.out.println("color="+ color);
        System.out.println("fille="+filled);
        System.out.println("Area=" + Area);
        System.out.println("perimeter="+ primeter);
    }
    public Square (String color, String Ten, Boolean filled, double width, double length , double side)
    {

        super (color, Ten , filled , width, length);
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }
    public void setwidth(double side)
    {
        this.width = width;
    }
    public void setlength(double side)
    {
        this.length = length;
    }



}
