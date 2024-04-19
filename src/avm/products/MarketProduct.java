package avm.products;

import general.BaseProduct;
import general.Product;

public class MarketProduct extends BaseProduct {
    private int quantity;

    public MarketProduct(String type, Product product, int quantity) {
        super(type, product, quantity);
    }
}
