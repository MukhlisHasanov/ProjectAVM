package clothShop;
/**
 * AIT-TR, Cohort 42.1
 * Project AVM/ClothShop
 * @author Valerian
 * @version 14-04-24
 */
import general.Product;
import huperMarket.MarketProduct;

public class ClothProduct extends MarketProduct {
    public ClothProduct(int id, Product product, String type, int quantity) {
        super(id, product, type, quantity);
    }
}

