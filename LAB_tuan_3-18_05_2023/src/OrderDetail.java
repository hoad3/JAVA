public class OrderDetail
{
    int thanhtien;
    private int quatity;
    private Product product;
    int value;
    public OrderDetail(int quatity, Product product)
    {
        this.quatity = quatity;
        this.product = product;
    }
    public int getQuatity()
    {
        return quatity;
    }
    private void setQuatity()
    {
        this.quatity = quatity;
    }
    public Product getProduct()
    {
        return product;
    }
    public void setProduct()
    {
        this.product = product;
    }
    public double caclTotalprice()
    {
        double thanhtien;
        return thanhtien = getQuatity() * Product.getPrice();
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "thanhtien=" + thanhtien +
                ", quatity=" + quatity +
                ", product=" + product +
                ", value=" + value +
                '}';
    }
}
