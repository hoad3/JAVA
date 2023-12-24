import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int sodien;
                int tien = 0;
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhap vao so dien trong thang:");
                sodien = scanner.nextInt();
                if (sodien <= 50)
                {
                    tien = sodien * 1000;
                    System.out.println("so tien dien phai tra trong thang la:" + tien);
                }
                else
                {
                    tien = 50*1000 + (sodien - 50) * 1200;
                    System.out.println("so tien dien phai tra trong thang la:" + tien);
                }

            }
        }

