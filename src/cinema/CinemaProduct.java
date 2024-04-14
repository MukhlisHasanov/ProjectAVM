package cinema;
/**
 * AIT-TR, Cohort 42.1
 * Project AVM/Cinema
 * @author Valerian
 * @version 14-04-24
 */


import general.Product;
import huperMarket.MarketProduct;

public class CinemaProduct extends MarketProduct {
    public CinemaProduct(int id, Product product, String type, int quantity) {
        super(id, product, type, quantity);
    }
}
