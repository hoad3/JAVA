import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        QuangLyHangHoa quangLyHangHoa = new QuangLyHangHoa();
        HangHoa hh = new HangHoa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1.them hang hoa" + "\n2.xuat hang hoa" + " nhap lua chon cua ban! ");
        int i = scanner.nextInt();
        if (i == 1) {
            hh = new HangThucPham();
            quangLyHangHoa.themHangHoa();
        }
        if ( i == 2 ){
            hh = new HangThucPham();
            quangLyHangHoa.xuatHangHoa();
        }
    }
}