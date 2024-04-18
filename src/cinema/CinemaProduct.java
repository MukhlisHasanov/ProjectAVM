package cinema;

import general.Product;
import huperMarket.MarketProduct;

public class CinemaProduct extends MarketProduct {
    public CinemaProduct(int id, String type, Product product, int quantity) {
        super(type, product, quantity);
    }
}
