import java.util.List;

public interface IStore {
    //buy(Product), sell(Product), getRevenue():double
    public void buy(Product product);
    public void sell(Product product);
    public double getRevenue();
    default List<Product> getInventory() { return null;}
    default void reset(){};
}
