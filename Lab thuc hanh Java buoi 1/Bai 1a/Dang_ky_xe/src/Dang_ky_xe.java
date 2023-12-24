import java.util.Scanner;

public class Dang_ky_xe
{
    String Ten_nguoi;

    String Ten_xe;
    int CC;
    double value_car;
    double thue;
    public void Thong_tin_xe(String Ten_xe, int CC, double value_car, double thue) {
        this.Ten_xe = Ten_xe;
        this.CC = CC;
        this.value_car = value_car;
        this.thue = thue;
    }
    public void Nhap() {


            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap vao ten nguoi dan: ");
            Ten_nguoi = scanner.nextLine();
            System.out.println("nhap vao ten xe: ");
            Ten_xe = scanner.nextLine();
            System.out.println("nhap vao dung tich xe: ");
            CC = scanner.nextInt();
            System.out.println("nhap vao gia tri xe: ");
            value_car = scanner.nextInt();
            if (CC < 100) {
                thue = value_car * 1 / 100;
            }
            else if (CC <= 200) {
                thue = value_car * 3 / 100;
            }
            else {
                thue = value_car * 5 / 100;
            }


        }

    public void Xuat()
    {
        System.out.format("%-26s %-26s %-26s %-26f %-26f\n",Ten_nguoi,Ten_xe, CC,value_car, thue);
    }



}
