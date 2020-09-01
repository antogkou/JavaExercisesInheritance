public class SimpleRetailStore implements IStore {
    //Fields:totalBuyBalance:double, totalSellBalance:double

    private double totalBuyBalance;
    private double totalSellBalance;

    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }
}
