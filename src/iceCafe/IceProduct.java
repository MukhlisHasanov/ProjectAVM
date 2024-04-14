package iceCafe;
/**
 * AIT-TR, Cohort 42.1
 * Project AVM/IceCoffee
 * @author Valerian
 * @version 14-04-24
 */
import general.Product;
import huperMarket.MarketProduct;

public class IceProduct extends MarketProduct {
    public IceProduct(int id, Product product, String type, int quantity) {
        super(id, product, type, quantity);
    }
}
