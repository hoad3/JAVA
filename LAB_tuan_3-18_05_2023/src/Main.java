import java.io.PrintStream;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args)
    {
        Locale locale = new Locale("vi", "VN");
        order O = new order(001, LocalDate.now());
        NumberFormat Num = NumberFormat.getCompactNumberInstance();
        Product sp1 = new Product("Gao", "sp1", 25000);
        OrderDetail ODT1 = new OrderDetail(10, sp1);
        Product sp2 = new Product("Nuoc tuong", "sp2", 16000);
        OrderDetail ODT2 = new OrderDetail(5, sp2);
        Product sp3 = new Product("Duong", "sp3", 12000);
        OrderDetail ODT3 = new OrderDetail(11, sp3);
        Product sp4 = new Product("Cocacola", "sp4", 12000);
        OrderDetail ODT4 = new OrderDetail(10, sp4);
        Product sp5 = new Product("nuoc mam", "sp5", 56000);
        OrderDetail ODT5 = new OrderDetail(15, sp5);


        O.lineItems = new ArrayList<>();
        O.addlineitems(sp1, ODT1.getQuatity() );
        O.addlineitems(sp2, ODT2.getQuatity() );
        O.addlineitems(sp3, ODT3.getQuatity() );
        O.addlineitems(sp4, ODT4.getQuatity() );
        O.addlineitems(sp5, ODT5.getQuatity() );
    System.out.println("Ma HD " + O.getOrDerID());
    System.out.println("ngay lap hoa don "  + O.getOrDerDate());
    System.out.printf( "\n%-26s %-26s %-26s %-26s %-26s %-26s", "STT", "Ma sp", "Mo ta", "Don gia", "So luong", "Thanh tien");
for(OrderDetail orderDetail : O.getLineItems())
{
    PrintStream printf = System.out.printf("\n%-26s %-26s %-26s %-26s %-26s %-26s",
            O.getLineItems().indexOf(orderDetail) + 1,
           "|"   +orderDetail.getProduct().getProductID(),
            "|"  + orderDetail.getProduct().getDescription(),
            "|"  + orderDetail.getProduct().getPrice(),
            "|"  + orderDetail.getQuatity(),
            "|"  + orderDetail.caclTotalprice() + "VND"
            );

}
        System.out.println("\nso tien can thanh toan la: " + O.caclTotalchange() + "VND");
    }

}