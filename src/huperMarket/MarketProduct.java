package huperMarket;

import general.Product;

import java.util.ArrayList;
import java.util.List;

public class MarketProduct {
    private int id;
    public Product product;
    private String type;
    private int quantity;
    protected List<MarketProduct> products;

    public MarketProduct(int id, Product product, String type, int quantity) {
        this.id = id;
        this.product = product;
        this.type = type;
        this.quantity = quantity;
        this.products = new ArrayList<>();
    }

    public MarketProduct() {
    }

    public void add(int id, Product product, String type, int quantity) {
        boolean found = false;
        if (!products.isEmpty()) {
            for (MarketProduct item : products) {
                if (item.getProduct().equals(product) || item.getId() == id) {
                    item.setQuantity(item.getQuantity() + quantity);
                    found = true;
                    return;
                }
            }
        }
        if (!found) {
            products.add(new MarketProduct(id, product, type, quantity));
        }
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "product= [" + product + ", " + type + ", " + quantity + ']';
    }
}
