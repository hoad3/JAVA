package bai1;

public class Point2D
{
    private float x=0f;
    private float y=0f;
    Point2D(){
        this.x=0;
        this.y=0;
    };
    Point2D(float x,float y){
        this.x=x;
        this.y=y;
    };
    float getX(){
        return x;
    };
    float getY(){
        return y;
    };
}
