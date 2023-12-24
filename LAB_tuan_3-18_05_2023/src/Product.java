import jdk.jfr.Description;

public class Product
{

    String  description;
    String ProductID;
    static double price;
    public Product( String description, String ProductID, double price)
    {
        this.description = description;
        this.ProductID = ProductID;
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }
    public void setDescription()
    {
        this.description = description;
    }
    public String getProductID()
    {
        return  ProductID;
    }
    public void setProductID()
    {
        this.ProductID = ProductID;
    }
    public static double getPrice()
    {
        return price;
    }
    public void setPrice()
    {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", ProductID='" + ProductID + '\'' +
                ", price=" + price +
                '}';
    }
}

