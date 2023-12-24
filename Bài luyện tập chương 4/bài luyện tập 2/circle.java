import BT.String;

public class circle extends shape{
    public double radius = 2.0;
    public float PI = 3.14F ;

    public void tencircle()
    {
        Ten = "circle";
    }
    public void Areacircle()
    {
        Area = (radius*radius)* PI;

    }
    public void Perimetercircle()
    {
        primeter = radius* PI;

    }
    public circle (String color, String Ten, Boolean filled, double radius, double PI)
    {
        super(color, Ten, filled);
        this.radius = radius;
        this.PI =(float) PI;
    }
    public void xuatcircle()
    {
        System.out.println("ten="+Ten);
        System.out.println("color="+color);
        System.out.println("flilled="+filled);
        System.out.println("Area="+Area);
        System.out.println("Perimeter="+ primeter);
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius() {
        this.radius = radius;
    }
    public double getArea(){
        return (radius*radius)* PI;
    }
    public double getPerimeter(){
        return radius* PI ;
    }


}
