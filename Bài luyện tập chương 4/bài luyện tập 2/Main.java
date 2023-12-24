
public class Main {
    public static void main(String[] args)

    {

        Rectangle rectangle = new Rectangle( "Red" ,"Reactangle", true , 3.0, 2.0) ;
        rectangle.AreaRectangle();
        rectangle.primeterRectangle();
        rectangle.tenRectangle();
        rectangle.xuatRectangle();
        System.out.println("<----------------------------------------->");

        circle circle = new circle("red", "circle", true, 2.0, 3.14);
        circle.Areacircle();
        circle.tencircle();
        circle.Perimetercircle();
        circle.xuatcircle();
        System.out.println("<----------------------------------------->");
        Square square = new Square("Red" ,"Square", true , 2.0, 2.0, 2.0);
        square.tenSquare();
        square.AreaSquare();
        square.primeterSquare();
        square.xuatSquare();
    }



}
