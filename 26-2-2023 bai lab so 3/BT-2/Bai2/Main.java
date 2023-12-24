package Bai2;

public class Main
{
    public static void main(String[] args)
    {
        Vector vector = new Vector(2,3,4);
        vector.NhanVohuong(vector);
        int NhanVohuong = vector.NhanVohuong(vector);
        System.out.println("\nket qua Nhan vo huong 2 vector:" + NhanVohuong );
        System.out.println( vector.getX()+ " " + vector.getY()+ " " + vector.getZ());
    }

}