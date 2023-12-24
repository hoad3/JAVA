import java.time.LocalDate;
import java.util.ArrayList;

public class order
{
    public int orDerID;
    public LocalDate orDerDate;
    ArrayList<OrderDetail> lineItems;
    int count = 0;
    public order(int orDerID, LocalDate orDerDate)
    {
        this.orDerID = orDerID;
        this.orDerDate = orDerDate;
    }
    public int getOrDerID()
    {
        return orDerID;
    }
    public void setOrDerID()
    {
        this.orDerID = orDerID;
    }
    public LocalDate getOrDerDate()
    {
        return orDerDate;
    }
    public void setOrDerDate()
    {
        this.orDerID = orDerID;
    }
    public ArrayList<OrderDetail> getLineItems()
    {
        return lineItems;
    }
    public void setLineItems()
    {
        this.lineItems = lineItems;
    }
    public void addlineitems(Product p, int x)
    {
        lineItems.add(new OrderDetail(x,p));
    }
    public double caclTotalchange()
    {
        double thanhtien = 0;
        for (OrderDetail L : lineItems) {
            thanhtien += L.caclTotalprice();
        }
        return thanhtien;
    }


}
