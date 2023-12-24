import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int a,b;
        int tong = 0;
        System.out.println("Nhap vao hai so nguyen a,b:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        if (a==0)
            if(b==0)

                System.out.println("phuong trinh vo so nghiem:");
            else
                System.out.println("phuong trinh vo nghiem:");
        else
            tong = -b/a;
        System.out.printf("tong = %s%n", tong);
        }
    }
