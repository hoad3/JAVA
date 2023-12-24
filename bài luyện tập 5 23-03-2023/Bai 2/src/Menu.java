import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{
    ArrayList<Hinh> Menu;
    public Menu()
    {
        while (true) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("\nlua chon 1 tinh dien tich hinh chu nhat: ");
            list.add("\nlua chon 2 tinh dien tich hinh tron: ");
            list.add("\nlua chon 3 thoat: ");
            System.out.println("\nnhap vao lua chon cua ban: ");
            System.out.println(list);
            int luachon;
            Scanner scanner = new Scanner(System.in);
            luachon = scanner.nextInt();
            if (luachon == 1)
            {
                HinhChuNhat hinhChuNhat = new HinhChuNhat();
                System.out.println( hinhChuNhat.DientichHCN() );
            }
            else if (luachon == 2)
            {
                HinhTron hinhTron = new HinhTron();
                System.out.println(hinhTron.DientichHT());

            }
            else if (luachon == 3)
            {
                break;
            }

        }
    }

}




