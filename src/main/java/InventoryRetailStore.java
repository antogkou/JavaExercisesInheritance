import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryRetailStore implements IStore {
    private final List<Product> products;
    private final List<Product> allProducts;

    public InventoryRetailStore() {
        products = new ArrayList<>();
        allProducts = new ArrayList<>();
    }

    @Override
    public void buy(Product product) {
        products.add(product);
        allProducts.add(product);
    }

    @Override
    public void sell(Product product) {
        if (products.contains(product)) {
            products.remove(product);
        }else {
            System.out.println("The product with the name: " + product.getName() + " cannot be removed. It does not exist in your inventory!");
        }
    }

    @Override
    public double getRevenue() {
        double myRevenue = 0;
        for (Product product : allProducts) {
            myRevenue -= product.getPriceWhenBuy();
            if (!products.contains((product))){
                myRevenue += product.getPriceWhenSell();
            }
        }
        return  myRevenue;
    }

    @Override
    public List<Product> getInventory() {
      for (Product product : products)
          System.out.println("Products in your inventory: "
                  + product.getName() + ", with id: " + product.getId());
      return products;
    }

    @Override
    public void reset() {
        allProducts.clear();
        products.clear();
    }
}
